package pertemuan11;

public class queuenasabah {
    nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public queuenasabah(int n) {
        max = n;
        data = new nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Element Terdepan: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " "
                        + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " "
                    + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah Element: " + size);
        }
    }

    public boolean clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil Dikosongkan");
            return true;
        } else {
            System.out.println("Queue Masih Kosong");
            return false;
        }
    }

    public boolean enqueue(nasabah dt) {
        if (isFull()) {
            System.out.println("Queue Sudah Penuh");
            return false;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        data[rear] = dt;
        size++;
        return true;
    }

    public nasabah dequeue() {
        nasabah dt = new nasabah();
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println(data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " "
                    + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
}
