package Pertemuan9;

import java.util.Scanner;

public class postfixmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        postfix post = new postfix(total);
        P = post.konversi(Q);
        System.out.println("Posttix: " + P);

    }

}
