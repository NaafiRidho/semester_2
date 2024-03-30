package Pertemuan5;
import java.util.Scanner;

public class faktorialmain {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan Jumlah element yang ingin dihitung : ");
        int element=sc.nextInt();
        faktorial[]fk=new faktorial[element];
        for(int i=0; i<element;i++){
            fk[i]=new faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai=sc.nextInt();
        }
        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Brute Force: ");
        for(int i=0; i<element;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer: ");
        for(int i=0; i<element;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("============================================================");
    }
}
