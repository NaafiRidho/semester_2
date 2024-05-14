package Pertemuan9;

public class strukmain {
    public static void main(String[] args) {
        stackstruk stack = new stackstruk(8); 
        
        stack.push(new struk(1, 3, "2024-01-01", 150000));
        stack.push(new struk(2, 2, "2024-01-05", 80000));
        stack.push(new struk(3, 1, "2024-01-10", 50000));
        stack.push(new struk(4, 4, "2024-01-15", 200000));
        stack.push(new struk(5, 2, "2024-01-20", 100000));
        stack.push(new struk(6, 3, "2024-01-25", 120000));
        stack.push(new struk(7, 2, "2024-01-30", 90000));
        stack.push(new struk(8, 1, "2024-02-05", 45000));

        stack.print();

        int jumlahStrukDitukar = 5;
        System.out.println("Struk Belanja yang Dikeluarkan:");
        for (int i = 0; i < jumlahStrukDitukar; i++) {
            struk s=stack.pop();
            if ( s != null) {
                System.out.println("Nomor Transaksi: " + s.nmrTrs);
                System.out.println("Tanggal Pembelian: " + s.tglPbl);
                System.out.println("Jumlah Barang: " + s.jmlBrg);
                System.out.println("Total Harga: " + s.ttlHrg);
                System.out.println("---------------------");
            }
        }
    }
}
