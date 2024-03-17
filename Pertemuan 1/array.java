import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String[] mata = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking Dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan Dan Kesehantan Kerja" };
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];
        double total = 0;
        double totalSKS = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mata.length; i++) {
            System.out.print("masukkan nilai angka untuk MK " + mata[i] + ":");
            nilaiAngka[i] = sc.nextDouble();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 || nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.printf("%-40s %-15s %-15s %-15s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mata.length; i++) {
            System.out.printf("%-40s %-15s %-15s %-15s%n", mata[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        for (int i = 0; i < bobotNilai.length; i++) {
            double IP = bobotNilai[i] * sks[i];
            total += IP;
            totalSKS += sks[i];
        }
        total = total / totalSKS;
        System.out.printf("%.2f", total);
    }
}
