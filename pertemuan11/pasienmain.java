package pertemuan11;

import java.util.Scanner;

public class pasienmain {
    public static void menu() {
        System.out.println("Masukkan Operasi Yang Diginkan: ");
        System.out.println("1. Pasien Baru");
        System.out.println("2. Pasien Keluar");
        System.out.println("3. Cek Pasien Terdepan");
        System.out.println("4. Cek Semua Pasien");
        System.out.println("5. Cek Pasien Paling Belakang");
        System.out.println("6. Pencarian Pasien");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue: ");
        int jumlah = sc.nextInt();
        queuepasien pasien = new queuepasien(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("No ID Pasien: ");
                    int noID = sc.nextInt();
                    System.out.print("Usia Pasien: ");
                    int usia = sc.nextInt();
                    System.out.print("Jenis Kelamin (L/P)");
                    char jenisKelamin = sc.next().charAt(0);
                    pasien ps = new pasien(nama, noID, usia, jenisKelamin);
                    pasien.enqueue(ps);
                    break;
                case 2:
                    pasien pa = pasien.dequeue();
                    System.out.println(
                            "Pasien Yang Keluar " + pa.nama + " " + pa.noID + " " + pa.umur + " " + pa.jenisKelamin);
                    break;
                case 3:
                    pasien.peek();
                    break;
                case 4:
                    pasien.print();
                    break;
                case 5:
                    pasien.peekRear();
                    break;
                case 6:
                    System.out.println("Pasien Yang dicari: ");
                    sc.nextLine();
                    String cari = sc.nextLine();
                    pasien.peekPosition(cari);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
