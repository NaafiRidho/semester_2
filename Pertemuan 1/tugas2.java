import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char menu;
        int hasilAkhir;
        System.out.println("Masukkan Pilihan Anda");
        System.out.println("1.Kecepatan");
        System.out.println("2.Jarak");
        System.out.println("3.Waktu");
        menu = sc.nextLine().charAt(0);
        switch (menu) {
            case '1':
                hasilAkhir = Kecepatan();
                System.out.println("Hasil Perhitungan Kecepatan adalah " + hasilAkhir + " km/jam");

                break;
            case '2':
                hasilAkhir = jarak();
                System.out.println("Hasil Perhitungan Jarak adalah " + hasilAkhir + " km");

                break;
            case '3':
                hasilAkhir = waktu();
                System.out.println("Hasil Perhitungan Waktu adalah " + hasilAkhir + " jam");

                break;
        }
    }

    static int Kecepatan() {
        int hasil = 0, jarak = 0, waktu = 0;
        System.out.println("Masukkan Jarak: ");
        jarak = sc.nextInt();
        System.out.println("Masukkan Waktu: ");
        waktu = sc.nextInt();
        hasil = jarak / waktu;

        return hasil;
    }

    static int jarak() {
        int hasil = 0, Kecepatan = 0, waktu = 0;
        System.out.println("Masukkan Kecepatan: ");
        Kecepatan = sc.nextInt();
        System.out.println("Masukkan Waktu: ");
        waktu = sc.nextInt();
        hasil = Kecepatan * waktu;
        return hasil;
    }

    static int waktu() {
        int hasil = 0, jarak = 0, Kecepatan = 0;
        System.out.println("Masukkan Jarak: ");
        jarak = sc.nextInt();
        System.out.println("Masukkan Kecepatan: ");
        Kecepatan = sc.nextInt();
        hasil = jarak / Kecepatan;

        return hasil;
    }
}
