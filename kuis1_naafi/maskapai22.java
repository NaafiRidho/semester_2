package kuis1_naafi;

public class maskapai22 {
    String nomor, tujuan;
    int tiket,tersedia,terdaftar;

    public maskapai22(){
    }
    public maskapai22(String nomor,String tujuan,int tiket,int tersedia,int terdaftar){
        this.nomor=nomor;
        this.tujuan=tujuan;
        this.tiket=tiket;
        this.tersedia=tersedia;
        this.terdaftar=terdaftar;
    }
    void tampil(){
        System.out.println("nomor:"+nomor);
        System.out.println("tujuan:"+tujuan);
        System.out.println("tiket:"+tiket);
        System.out.println("tersedia:"+tersedia);
        System.out.println("terdaftar:"+terdaftar);

    }
    int hitungSisaKursi(){
        return tersedia-terdaftar;
    }
    void daftarMaskapai(){
        if(tiket>1000000&&tiket<2000000){
            System.out.println("Termasuk maskapai: Eksekutif");
        }else if(tiket>500000&&tiket<1000000){
            System.out.println("Termasuk maskapai: Bisnis");
        }else{
            System.out.println("Termasuk Maskapai: Ekonomi");
        }
    }

}
