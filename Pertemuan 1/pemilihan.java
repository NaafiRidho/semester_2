import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        double nilaiKuis;
        double nilaiTugas;
        double UTS;
        double UAS;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        UTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        UAS = sc.nextDouble();
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || UAS < 0 || UAS > 100 || UTS < 0
                || UTS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double nilaiAkhir = nilaiTugas * 0.2 + nilaiKuis * 0.2 + UTS * 0.3 + UAS * 0.3;
            String nilaiHuruf = "A";
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";

            } else if (nilaiAkhir > 50 || nilaiAkhir <= 60) {
                nilaiHuruf = "C";

            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";

            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("TIDAK LULUS");
            } else {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf);
                System.out.println("SELAMAT ANDA LULUS");
            }
        }

    }
}
