package Pertemuan12;

public class sllmain {
    public static void main(String[] args) {
        linkedlist myLinkedlist=new linkedlist();
        myLinkedlist.print();
        myLinkedlist.addfirst(800);
        myLinkedlist.print();
        myLinkedlist.addfirst(700);
        myLinkedlist.print();
        myLinkedlist.addlast(500);
        myLinkedlist.print();
        myLinkedlist.insertAfter(700, 300);
        myLinkedlist.print();
        myLinkedlist.insertBefore(800,400);
        myLinkedlist.print();
        myLinkedlist.insertAt(2, 250);
        myLinkedlist.print();
        System.out.println("Data Pada Index ke-1: "+myLinkedlist.getData(1));
        System.out.println("Data 300 berada pada index ke: "+myLinkedlist.indexOf(300));
        myLinkedlist.remove(300);
        myLinkedlist.print();
        myLinkedlist.removeFirst();
        myLinkedlist.print();
        myLinkedlist.removeLast();
        myLinkedlist.print();
        myLinkedlist.removeAt(1);
        myLinkedlist.print();
    }
}
