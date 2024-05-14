package Pertemuan12;

import java.util.Scanner;

public class scavengerhunt {
    huntnode head;
    Scanner sc = new Scanner(System.in);

    public void addNode(String soal, String jawaban) {
        huntnode newNode = new huntnode(soal, jawaban, null);
        if (head == null) {
            head = newNode;
        } else {
            huntnode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void jawab() {
        huntnode currentNode = head;
        while (currentNode != null) {
            System.out.println("Soal: " + currentNode.soal);
            System.out.print("Jawab: ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase(currentNode.jawab)) {
                currentNode = currentNode.next;
            } else {
                System.out.println("Jawaban Salah Ulangi Lagi");
            }
        }
        System.out.println("Selamat Anda Telah Menemukan Harta Karun");
    }
}
