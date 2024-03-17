/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg3;

/**
 *
 * @author ujute
 */
public class transaksi {
    int saldo,jumlahTransaksi;
    
   int transaksi(){
   return saldo-jumlahTransaksi;
   }
   void tampil(){
       System.out.println(transaksi());
   }
}
