package kuis1_naafi;
import java.util.Scanner;
public class maskapaimain {
    public static void main(String[] args) {
        maskapai22[] Maskapai22=new maskapai22[1];
        Scanner sc=new Scanner(System.in);
        int sisa;
        for(int i=0; i<Maskapai22.length;i++){
            System.out.println("Masukkan nomor penerbangan:");
            String nomor=sc.next();
            System.out.println("Masukkan tujuan:");
            String tujuan=sc.next();
            System.out.println("Masukkan Harga tiket:");
            int HargaTiket=sc.nextInt();
            System.out.println("tiket yang tersedia:");
            int tersedia=sc.nextInt();
            System.out.println("terdaftar: ");
            int terdaftar=sc.nextInt();
            Maskapai22[i]=new maskapai22(nomor, tujuan, HargaTiket, tersedia, terdaftar);
        }
        for(int i=0; i<Maskapai22.length;i++){
            Maskapai22[i].tampil();
        }
        for(int i=0; i<Maskapai22.length;i++){
            sisa=Maskapai22[i].hitungSisaKursi();
            System.out.println("sisa kursi dari maskapai tujuan "+Maskapai22[i].tujuan);
            System.out.println(sisa);
        }
        for(int i=0; i<Maskapai22.length;i++){
            System.out.print("Kelas dari maskapai tujuan "+Maskapai22[i].tujuan+" ");
            Maskapai22[i].daftarMaskapai();
        }
    }
}
