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

public class transaksiNasabah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        transaksi[] arrayTransaksi = new transaksi[3];
        arrayTransaksi[0] = new transaksi();
        arrayTransaksi[0].saldo = 1000000;
        System.out.print("Masukkan jumalah Transaksi:");
        arrayTransaksi[0].jumlahTransaksi = sc.nextInt();
        if (arrayTransaksi[0].saldo > arrayTransaksi[0].jumlahTransaksi) {
            arrayTransaksi[0].transaksi();
            System.out.print("Sisa Saldo:");
            arrayTransaksi[0].tampil();
        } else {
            System.out.println("SALDO TIDAK MENCUKUPI");
        }
    }
}
