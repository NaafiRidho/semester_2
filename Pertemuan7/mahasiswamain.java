package Pertemuan7;

import java.util.Scanner;

public class mahasiswamain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        int jumMhs = s.nextInt();
        pencarianmhs data = new pencarianmhs(jumMhs);

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkacil");
        for (int i = 0; i < jumMhs; i++) {

            System.out.println("---------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        data.sort();
        System.out.println("-------------------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
        System.out.println("_______________________________________________________");

        System.out.println("_______________________________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan nim mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cari = sl.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.println("======================");
        System.out.println("mengunakan binary search");
        int posis = data.findBinarySearch(posisi, 0, jumMhs - 1);
        data.tampilPosisi(cari, posis);
        data.tampilData(cari, posis);
    }
}
