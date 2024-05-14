package Pertemuan7;

public class pencarianmhs {
    mahasiswa listMhs[];
    int idx;
    
    pencarianmhs(int j){
    listMhs=new mahasiswa[j];
    idx=0;
    }

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
    public int findSeqSearch(String cari){
        int posisi=-1,jml=0;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nama.equalsIgnoreCase(cari)) {
                posisi=i;
                jml++;
            }
        }
        if (jml>1) {
            System.out.println("Data yang dicari lebih dari 1!");
        }
        return posisi;
    }
    public void tampilPosisi(String x,int pos){
        if (pos!=-1) {
            System.out.println("data: "+x+"ditemukan pada index ke- "+pos);
        }
        else{
            System.out.println("Data: "+x+"tidak ditemukan");
        }
    }
    public void tampilData(String x, int pos){
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
    public int findBinarySearch(int pos,int left,int right){
        int mid,cari=listMhs[pos].nim;
        if (right>=left) {
            mid=(left+right)/2;
            if (cari==listMhs[mid].nim) {
                return mid;
            }
            else if (listMhs[mid].nim< cari) {
                return findBinarySearch(pos, left, right-1);
            }
            else{
                return findBinarySearch(pos,left+1,right);
            }
        }
        return -1;

    }
    void sort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].nim>listMhs[j-1].nim) {
                    mahasiswa tmp=listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
