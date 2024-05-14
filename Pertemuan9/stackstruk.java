package Pertemuan9;

public class stackstruk {
    int size, top;
    struk[] data;

    public stackstruk(int size) {
        this.size = size;
        data = new struk[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(struk stk) {
        if (!isFull()) {
            top++;
            data[top] = stk;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    public struk pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Data Masih Kosong");
            return null;
        }
    }

    public void print() {
        System.out.println("Isi Stack");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].nmrTrs + " " + data[i].tglPbl + " " + data[i].jmlBrg + " " + data[i].ttlHrg);
        }
        System.out.println(" ");
    }

}
