/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg3;

/**
 *
 * @author ujute
 */
public class mahasiswa {
    public String nama,nim;
    public char jenisKelamin;
    public double ipk;
    
    public mahasiswa(){
    }
    public mahasiswa(String n,String ni,char j, double i){
        nama=n;
        nim=ni;
        jenisKelamin=j;
        ipk=i;
    }
   
    void cetakinfo(){
        System.out.println("nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Jenis Kelamin: "+jenisKelamin);
        System.out.println("nilai ipk: "+ipk);
    }
    double rata(double[]rata,int size){
        double rata2=0;
        for (int i = 0; i < rata.length; i++) {
            rata2+=rata[i]/size;
        }
        return rata2; 
    }
}
