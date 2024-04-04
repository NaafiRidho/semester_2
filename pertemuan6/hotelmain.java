package pertemuan6;

public class hotelmain {
    public static void main(String[] args) {
        hotelService list=new hotelService();
        byte[]b={4,3,5,3,2};
        hotel hotel1=new hotel("Ibis", "Surabaya", 1000000, b[0]);
        hotel hotel2=new hotel("Savana", "Malang", 750000,b[1]);
        hotel hotel3=new hotel("Satria", "Jakarta", 2000000, b[2]);
        hotel hotel4=new hotel("Begawan", "Malang", 600000, b[3]);
        hotel hotel5=new hotel("Melati", "Kediri", 300000, b[4]);

        list.tambah(hotel1);
        list.tambah(hotel2);
        list.tambah(hotel3);
        list.tambah(hotel4);
        list.tambah(hotel5);

        System.out.println("Sebelum Disorting");
        list.tampilAll();
        System.out.println("Sesudah Disorting berdasarkan harga");
        list.selectionSortHarga();
        list.tampilAll();
        System.out.println("Sesudah Disorting berdasarkan Bintang");
        list.selectionSortBintang();
        list.tampilAll();
        
    }
}
