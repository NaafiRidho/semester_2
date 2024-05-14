import java.util.Scanner;

public class barangmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        barang b;
        char lanjut = 'n';
        System.out.println("Masukkan Jumlah Barang:");
        int barang = sc.nextInt();
        pencarianBarang data = new pencarianBarang(barang);
        do {
            System.out.println("Pilih Menu: ");
            System.out.println("1. Tambah Barang: ");
            System.out.println("2. Penjualan Barang: ");
            System.out.println("3. Pengurutan Data: ");
            System.out.println("4. Pencarian Barang: ");
            System.out.println("5. Tampil Seluruh Data: ");
            System.out.println("----------------------------------");
            int Menu = sc.nextInt();
            switch (Menu) {
                case 1:
                    for (int i = 0; i < barang; i++) {
                        System.out.println("Masukkan Kode Barang ke-" + (i + 1) + ": ");
                        int kode = sc.nextInt();
                        System.out.println("Masukkan Nama Barang ke-" + (i + 1) + ": ");
                        String nama = sl.nextLine();
                        System.out.println("Masukkan Jumlah Stok: ");
                        int stok = sc.nextInt();
                        System.out.println("Masukkan Harga Satuan: ");
                        int harga = sc.nextInt();
                        System.out.println("----------------------------------");
                        b = new barang(kode, nama, stok, harga);
                        data.tambah(b);
                    }
                    data.tampil();
                    System.out.println("Apakah Ingin Lanjut (y/n): ");
                    lanjut = sc.next().charAt(0);
                    break;
                case 2:
                    System.out.println("Masukkan Nama Barang Yang Ingin Dibeli: ");
                    String terjual = sl.nextLine();
                    System.out.println("Jumlah Yang Dibeli: ");
                    int beli = sc.nextInt();
                    int total = data.penjualan(terjual, beli);
                    System.out.println("Total Harga: " + total);
                    System.out.println("Apakah Ingin Lanjut (y/n): ");
                    lanjut = sc.next().charAt(0);
                    break;
                case 3:
                    data.sort();
                    data.tampil();
                    System.out.println("Apakah Ingin Lanjut (y/n): ");
                    lanjut = sc.next().charAt(0);
                    break;
                case 4:
                    System.out.println("Data Yang Ducari: ");
                    String cari = sl.nextLine();
                    int c = data.searching(cari);
                    System.out.println("Nama Barang: " + cari);
                    System.out.println("Berada Pada: " + c);
                    System.out.println("Apakah Ingin Lanjut (y/n): ");
                    lanjut = sc.next().charAt(0);
                    break;
                case 5:
                    data.tampil();
                    System.out.println("Apakah Ingin Lanjut (y/n): ");
                    lanjut = sc.next().charAt(0);
                    break;
            }
        } while (lanjut == 'y' || lanjut == 'Y');
    }
}
