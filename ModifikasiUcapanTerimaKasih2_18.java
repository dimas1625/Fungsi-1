import java.util.Scanner;
/**
 * ModifikasiUcapanTerimaKasih2_18
 */
public class ModifikasiUcapanTerimaKasih2_18 {

    public static String penerimaUcapan () { Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine(); return namaOrang;
    }
    public static String ucapanTambahan() { Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan yang ingin Anda sampaikan: ");
        String tambahan = sc.nextLine();
        return tambahan;
}

    public static void ucapanTerimaKasih() { String nama = penerimaUcapan(); String tambahan = ucapanTambahan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me for learning and made me a love for learning and made me feel like i could ask you anything.");
        System.out.println("Kata-kata tambahan: " + tambahan);
    }
    public static void main(String[] args) { ucapanTerimaKasih();
    }
}