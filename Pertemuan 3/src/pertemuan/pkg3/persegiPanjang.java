/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg3;

/**
 *
 * @author ujute
 */
public class persegiPanjang {

    public int panjang;
    public int lebar;


    public persegiPanjang() {
    }

    public persegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    int hitungluas() {
        return panjang * lebar;
    }

    int hitungkeliling() {
        return 2 * (panjang + lebar);
    }

    void cetakinfo() {
            System.out.println( " panjang:" + panjang + " lebar:" + lebar + " luas:" + hitungluas() + " keliling:" + hitungkeliling());
    }
}
