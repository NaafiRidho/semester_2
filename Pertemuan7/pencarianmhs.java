package Pertemuan7;

public class pencarianmhs {
    mahasiswa listMhs[]=new mahasiswa[5];
    int idx;

    void tambah(mahasiswa m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for(mahasiswa m:listMhs){
            m.tampil();
            System.out.println("------------------");
        }
    }
    public int findSeqSearch(int cari){
        int posisi=-1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim==cari) {
                posisi=i;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi(int x,int pos){
        if (pos!=-1) {
            System.out.println("data: "+x+"ditemukan pada index ke- "+pos);
        }
        else{
            System.out.println("Data: "+x+"tidak ditemukan");
        }
    }
    public void tampilData(int x, int pos){
        if (pos!=-1) {
            System.out.println("NIM\t: "+x);
            System.out.println("Nama\t: "+listMhs[pos].nama);
            System.out.println("Umur\t: "+listMhs[pos].umur);
            System.out.println("IPK\t: "+listMhs[pos].ipk);
        }
        else{
            System.out.println("data "+x+"Tidak ditemukan");
        }
    }
    public int findBinarySearch(int cari,int left,int right){
        int mid;
        if (right>=left) {
            mid=(left+right)/2;
            if (cari==listMhs[mid].nim) {
                return mid;
            }
            else if (listMhs[mid].nim>cari) {
                return findBinarySearch(cari, left, right-1);
            }
            else{
                return findBinarySearch(cari,left+1,right);
            }
        }
        return -1;

    }
}
