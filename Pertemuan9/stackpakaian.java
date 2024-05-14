package Pertemuan9;

public class stackpakaian {
    int size, top;
    Pakaian data[];

    public stackpakaian(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data Yang Dekeluarkan: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " "
                    + x.harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        System.out.println("Element Teratas Stack: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk
                + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk
                    + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack Sudah Kosong");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void getMax() {
        if (!isEmpty()) {
            double Max = data[0].harga;
            Pakaian max = data[0];
            for (int i = 0; i < top; i++) {
                if (data[i].harga > Max) {
                    Max = data[i].harga;
                    max = data[i];
                }
            }
            System.out.println("Data Pakaian dengan Harga Tertinggi:");
            System.out.println(max.jenis + " " + max.warna + " " + max.merk
                    + " " + max.ukuran + " " + max.harga);
        }
        else{
            System.out.println("Stack Masih Kosong");
        }
    }

}
