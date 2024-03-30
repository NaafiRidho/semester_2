package Pertemuan5;
import java.util.Scanner;

public class akarmain {
    public static void main(String[] args) {
        akar[] akar=new akar[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < akar.length; i++) {
            System.out.println("akar ke-"+(i+1));
            int ak=sc.nextInt();
            akar[i]=new akar(ak);
        }
        for (int i = 0; i < akar.length; i++) {
            System.out.println("Hasil akar BF ke-"+(i+1)+":" +akar[i].akarBF());
            System.out.println("Hasil akar DC ke-"+(i+1)+":" +akar[i].akarDC());
        }
    }
}
