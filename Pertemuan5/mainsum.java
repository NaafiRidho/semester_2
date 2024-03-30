package Pertemuan5;

import java.util.Scanner;;

public class mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int perusahaan = sc.nextInt();
        double[] totalKeuntunganBF = new double[perusahaan];
        double[] totalKeuntunganDC = new double[perusahaan];

        for (int i = 0; i < perusahaan; i++) {
            System.out.println("=================================================================");
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int bulan = sc.nextInt();
            double[] keuntungan = new double[bulan];

            for (int j = 0; j < bulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk perusahaan ke-" + (i + 1) + ": ");
                keuntungan[j] = sc.nextDouble();
            }

            sum sm = new sum(bulan);
            totalKeuntunganBF[i] = sm.totalBF(keuntungan);
            totalKeuntunganDC[i] = sm.totalDC(keuntungan, 0, bulan - 1);
        }

        System.out.println("=================================================================");
        System.out.println("Total Keuntungan Setiap Perusahaan (Brute Force):");
        for (int i = 0; i < perusahaan; i++) {
            System.out.printf("Perusahaan ke-%d: %.2f %n", (i + 1), totalKeuntunganBF[i]);
        }

        System.out.println("=================================================================");
        System.out.println("Total Keuntungan Setiap Perusahaan (Divide and Conquer):");
        for (int i = 0; i < perusahaan; i++) {
            System.out.printf("Perusahaan ke-%d: %.2f %n", (i + 1), totalKeuntunganDC[i]);
        }
        System.out.println("=================================================================");
    }
}
