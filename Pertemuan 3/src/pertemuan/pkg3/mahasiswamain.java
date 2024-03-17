/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg3;

/**
 *
 * @author ujute
 */
import java.util.Scanner;

public class mahasiswamain {

    public static void main(String[] args) {
        mahasiswa[] Mahasiswa = new mahasiswa[3];
        int n=0;
        double[]rata=new double[3];
        double rata2=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Mahasiswa.length; i++) {
            System.out.print("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("\nMasukkan nama:");
            String nama = sc.next();
            System.out.print(" Masukkan NIM:");
            String nim = sc.next();
            System.out.print(" Masukkan jenis Kelmin:");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print(" Masukkan ipk ");
            double ipk = sc.nextDouble();
            Mahasiswa[i] = new mahasiswa(nama,nim,jenisKelamin,ipk);
        }
        for (mahasiswa i : Mahasiswa) {
            System.out.println("data mahasiswa ke-"+(n+1));
            i.cetakinfo();
            n++;
        }
        for (int i = 0; i < Mahasiswa.length; i++) {
            rata[i]=Mahasiswa[i].ipk;
            rata2=Mahasiswa[i].rata(rata, Mahasiswa.length);
        }
        System.out.printf("rata-rata ipk: %.1f",rata2);
    }
}
        