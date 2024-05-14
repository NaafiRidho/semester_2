package pertemuan11;

public class queuepasien {
    pasien[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public queuepasien(int n) {
        max = n;
        antrian = new pasien[max];
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
            System.out.println("Element Terdepan: " + antrian[front].noID + " " + antrian[front].nama + " "
                    + antrian[front].jenisKelamin + " " + antrian[front].umur);
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
                System.out.println(antrian[i].noID + " " + antrian[i].nama + " "
                        + antrian[i].jenisKelamin + " " + antrian[i].umur);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].noID + " " + antrian[i].nama + " "
                    + antrian[i].jenisKelamin + " " + antrian[i].umur);
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

    public boolean enqueue(pasien dt) {
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
        antrian[rear] = dt;
        size++;
        return true;
    }

    public pasien dequeue() {
        pasien dt = new pasien();
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            dt = antrian[front];
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
            System.out.println(antrian[rear].noID + " " + antrian[rear].nama + " " + antrian[rear].jenisKelamin + " "
                    + antrian[rear].umur);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void peekPosition(String nama) {
        int i = front;
        int a = 0;
        String cari = null;
        while (a < size) {
            if (nama.equalsIgnoreCase(antrian[i].nama)) {
                System.out.println("Nama " + nama + " Ditemukan Pada Antrian Ke-" + (a + 1));
                cari = antrian[i].nama;
                break;
            } else if (front == max - 1) {
                i = 0;
                a++;
            } else {
                i++;
                a++;
            }
        }
        if (cari == null) {
            System.out.println("Nama " + nama + " Tidak Ditemukan");
        }
    }
}
