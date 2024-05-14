package Pertemuan9;

import java.util.Scanner;

public class stackmain {
    public static void main(String[] args) {
        stackpakaian stk = new stackpakaian(5);
        Scanner sc = new Scanner(System.in);
        char pilih = 'n';
        int p1;
        do {
            System.out.println("Pilih Operasi-Oprasi Pada Stack");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Print");
            System.out.println("5.Max");
            System.out.print("Pilihan:");
            p1 = sc.nextInt();
            sc.nextLine();
            switch (p1) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    System.out.print("Apakah Anda Akan Melakukan Operasi Pada Stack(y/n)? ");
                    pilih = sc.next().charAt(0);
                    break;
                case 2:
                    stk.pop();
                    System.out.print("Apakah Anda Akan Melakukan Operasi Pada Stack(y/n)? ");
                    pilih = sc.next().charAt(0);
                    break;
                case 3:
                    stk.peek();
                    System.out.print("Apakah Anda Akan Melakukan Operasi Pada Stack(y/n)? ");
                    pilih = sc.next().charAt(0);
                    break;
                case 4:
                    stk.print();
                    System.out.print("Apakah Anda Akan Melakukan Operasi Pada Stack(y/n)? ");
                    pilih = sc.next().charAt(0);
                    break;
                case 5:
                    stk.getMax();
                    System.out.print("Apakah Anda Akan Melakukan Operasi Pada Stack(y/n)? ");
                    pilih = sc.next().charAt(0);
                    break;

            }
        } while (pilih == 'y' || pilih == 'Y');
    }
}
