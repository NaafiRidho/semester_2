public class barang {
    int kode, stok, hargaSatuan, terjual;
    String namaBarang;

    public barang(int k, String n, int s, int h) {
        kode = k;
        namaBarang = n;
        stok = s;
        hargaSatuan = h;
        terjual = 0;
    }

    void tampil() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("-----------------------------");
    }
}
