package Pertemuan5;

import java.util.Scanner;

public class pangkatmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah element yang ingin dihitung : ");
        int element = sc.nextInt();

        pangkat[] png = new pangkat[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(pangkat, nilai);
        }
        System.out.println("Ingin Menggunakan");
        System.out.println("1.Brute Force");
        System.out.println("2.Divide and Conquer");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("============================================================");
                System.out.println("Hasil pangkat dengan Brute Force");
                for (int i = 0; i < element; i++) {
                    System.out.printf("nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("============================================================");
                System.out.println("Hasil pangkat dengan Divide and Conquer ");
                for (int i = 0; i < element; i++) {
                    System.out.println("nilai" + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
        }
    }
}
