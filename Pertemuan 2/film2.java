public class film2 {
    public class film {
        String judul,genre,rate;
        int jumlahTiket,hargaTiket;
    
        void tampilFilm(){
            System.out.println("Judul: "+judul);
            System.out.println("Genre: "+genre);
            System.out.println("Rate: "+rate);
            System.out.println("Jumlah Tiket:"+jumlahTiket);
            System.out.println("Harga Yiket: "+hargaTiket);
        }
        void tambahTiket(int n){
            jumlahTiket+=n;
        }
        void kurangTiket(int n){
            jumlahTiket-=n;
        }
        int totalRevenue(int jumlah){
            return jumlah*hargaTiket;
        }
    }
    
}
