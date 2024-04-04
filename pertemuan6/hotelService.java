package pertemuan6;

public class hotelService {
    hotel rooms[] = new hotel[5];
    int idx;

    void tambah(hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        }

    }

    void tampilAll() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i].nama);
            System.out.println(rooms[i].kota);
            System.out.println(rooms[i].harga);
            System.out.println(rooms[i].bintang);
            System.out.println("------------------");
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;

                }
            }
        }
    }
    void bubbleSortBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[j - 1].bintang) {
                    hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;

                }
            }
        }
    }
    void selectionSortHarga(){
        for (int i = 0; i < rooms.length; i++) {
            int idxMin=i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga<rooms[idxMin].harga) {
                    idxMin=j;
                }
                hotel tmp=rooms[idxMin];
                rooms[idxMin]=rooms[i];
                rooms[i]=tmp;
            }
        }
    }
    void selectionSortBintang(){
        for (int i = 0; i < rooms.length; i++) {
            int idxMax=i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang>rooms[idxMax].bintang) {
                    idxMax=j;
                }
                hotel tmp=rooms[idxMax];
                rooms[idxMax]=rooms[i];
                rooms[i]=tmp;
            }
        }
    }
}
