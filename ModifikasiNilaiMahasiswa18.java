import java.util.Scanner; 
/**
 * ModifikasiNilaiMahasiswa18
 */
public class ModifikasiNilaiMahasiswa18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = scanner.nextInt();

        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        inputNilaiMahasiswa(nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
        tampilkanNilaiMahasiswa(nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
        nilaiTertinggiHari(nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
        mahasiswaTertinggi(nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
    }

    public static void inputNilaiMahasiswa(int[][] nilaiMahasiswa, int jumlahMahasiswa, int jumlahMinggu) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, int jumlahMahasiswa, int jumlahMinggu) {
        System.out.println("\nNilai Tugas Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nilaiTertinggiHari(int[][] nilaiMahasiswa, int jumlahMahasiswa, int jumlahMinggu) {
        int[] totalNilaiHari = new int[jumlahMinggu];
        int maxNilai = 0;
        int hariMax = 0;

        for (int j = 0; j < jumlahMinggu; j++) {
            totalNilaiHari[j] = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalNilaiHari[j] += nilaiMahasiswa[i][j];
            }
            if (totalNilaiHari[j] > maxNilai) {
                maxNilai = totalNilaiHari[j];
                hariMax = j + 1;
            }
        }

        System.out.println("\nNilai Tertinggi pada Hari ke-" + hariMax);
    }

    public static void mahasiswaTertinggi(int[][] nilaiMahasiswa, int jumlahMahasiswa, int jumlahMinggu) {
        int maxNilai = 0;
        int mahasiswaMax = 0;
        int mingguMax = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > maxNilai) {
                    maxNilai = nilaiMahasiswa[i][j];
                    mahasiswaMax = i + 1;
                    mingguMax = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa Tertinggi: Mahasiswa ke-" + mahasiswaMax);
        System.out.println("Nilai Tertinggi pada Minggu ke-" + mingguMax + ": " + maxNilai);
    }
}
