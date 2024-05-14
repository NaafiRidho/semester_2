package pertemuan11;

import java.util.Scanner;

public class queuemain {
    public static void menu() {
        System.out.println("Masukkan Operasi Yang Diginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();
        queue q = new queue(n);
        int pilih;
        boolean clear = false, enqueue = false;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (q.isFull()) {
                        System.out.println("Data Sudah Penuh");
                        pilih = -1;
                        break;
                    }
                    System.out.print("Masukkan Data Baru: ");
                    int dataMasuk = sc.nextInt();
                    q.enqueue(dataMasuk);
                    break;

                case 2:
                    if (q.isEmpty()) {
                        System.out.println("Data Masih Kosong");
                        pilih = -1;
                        break;
                    }
                    int dataKeluar = q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data Yang Dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilih == 2 || pilih == 3 || pilih == 4 || pilih==1 || pilih==5);
    }
}
