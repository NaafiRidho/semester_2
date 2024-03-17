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

public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang,lebar;
        System.out.println("Masukkan Banyaknya Persegi Panjang");
        int j=sc.nextInt();

        persegiPanjang[] arrayofPersegiPanjang = new persegiPanjang[j];
        for (int i = 0; i < arrayofPersegiPanjang.length; i++) {
            System.out.println("Persegi Panjang ke- " + (i + 1));
            System.out.println("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.println("Masukkan Lebar: ");
            lebar = sc.nextInt();
            arrayofPersegiPanjang[i] = new persegiPanjang(panjang,lebar);
        }
        for (int i = 0; i <  arrayofPersegiPanjang.length; i++) {
            System.out.print("Persegi Panjang ke-"+(i+1));
            arrayofPersegiPanjang[i].cetakinfo();
        }
    }
}
