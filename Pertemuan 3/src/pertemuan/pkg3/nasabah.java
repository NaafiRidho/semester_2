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
public class nasabah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        inputNasabah[]arrayNasabah=new inputNasabah[3];
        for (int i = 0; i < arrayNasabah.length; i++) {
            arrayNasabah[i]=new inputNasabah();
            System.out.print("Masukkan Nama Nasabah:");
            arrayNasabah[i].namaNasabah=sc.next();
            System.out.print("Masukkan Nomor Rekening:");
            arrayNasabah[i].noRekening=sc.nextInt();
            System.out.print("Masukkan Password:");
            arrayNasabah[i].pass=sc.nextInt();
            System.out.print("Masukkan Jumlah Saldo");
            arrayNasabah[i].saldo=sc.nextInt();
        }
        for (int i = 0; i < arrayNasabah.length; i++) {
            arrayNasabah[i].tampil();
        }
    }
}
