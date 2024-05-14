package Pertemuan12;

public class linkedlist {
    node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked list: ");
            node correntNode = head;
            while (correntNode != null) {
                System.out.print(correntNode.data + "\t");
                correntNode = correntNode.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addfirst(int input) {
        node newNode = new node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addlast(int input) {
        node newNode = new node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            node correntNode = head;

            while (correntNode.next != null) {
                correntNode = correntNode.next;
            }
            correntNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        node newNode = new node(input, null);
        if (!isEmpty()) {
            node correntNode = head;
            do {
                if (correntNode.data == key) {
                    newNode.next = correntNode.next;    
                    correntNode.next = newNode;
                    break;
                }
                correntNode = correntNode.next;
            } while (correntNode != null);
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void insertBefore(int key, int input) {
        node newNode = new node(input, null);
        node correntNode = head;
        if (!isEmpty()) {
            while (correntNode.next.data != key) {
                correntNode = correntNode.next;
            }
        }
        newNode.next = correntNode.next;
        correntNode.next = newNode;
    }

    public void insertAt(int index, int key) {
        node newNode = new node(key, null);
        node correntNode = head;
        for (int i = 0; i < index - 1; i++) {
            correntNode = correntNode.next;
        }
        newNode.next = correntNode.next;
        correntNode.next = newNode;
    }

    public int getData(int index) {
        node correntNode = head;
        for (int i = 0; i < index; i++) {
            if (correntNode==null) {
                System.out.println("Index melebihi batas index dari linked list");
                return -1;
            }
            correntNode = correntNode.next;
        }
        return correntNode.data;
    }

    public int indexOf(int key) {
        node correntNode = head;
        int index = 0;
        while (correntNode != null && correntNode.data != key) {
            correntNode = correntNode.next;
            index++;
        }
        if (correntNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            node correntNode = head;
            while (correntNode != null) {
                if (correntNode.next.next == null) {
                    correntNode.next = null;
                    break;
                }
                correntNode = correntNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            node correntNode = head;
            while (correntNode.next != null) {
                if (correntNode.next.data == key) {
                    correntNode.next = correntNode.next.next;
                    break;
                }
                correntNode = correntNode.next;
            }
        }
    }

    public void removeAt(int index) {
        node correntNode = head;
        int i = 0;
        if (index == 0) {
            removeFirst();
        } else {
            while (i < index) {
                if (i == index - 1) {
                    correntNode.next = correntNode.next.next;
                }
                correntNode = correntNode.next;
                i++;
            }
        }
    }

}
