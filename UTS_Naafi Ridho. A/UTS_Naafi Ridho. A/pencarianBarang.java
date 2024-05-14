public class pencarianBarang {
    barang[] data;
    int jumlah, size, jual;

    public pencarianBarang(int size) {
        data = new barang[size];
        this.size = size;
        jumlah = 0;
        jual = 0;
    }

    public void tambah(barang b) {
        if (jumlah < data.length) {
            data[jumlah] = b;
            jumlah++;
        } else {
            System.out.println("Barang Sudah Penuh");
        }
    }

    public void tampil() {
        for (barang barang : data) {
            barang.tampil();
        }
    }

    public int penjualan(String n, int jual) {
        int penjualan = searching(n);
        data[penjualan].stok -= jual;
        int totalHarga = data[penjualan].hargaSatuan * jual;
        data[penjualan].terjual += jual;
        return totalHarga;
    }

    public void sort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j].terjual > data[j - 1].terjual) {
                    barang tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println("-----------------------------");
            System.out.println("Nama " + data[i].namaBarang);
            System.out.println("terjual " + data[i].terjual);
            System.out.println("-----------------------------");
        }
    }

    public int searching(String nama) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].namaBarang.equalsIgnoreCase(nama)) {
                jual = i;
            }
        }
        return jual;
    }
}
