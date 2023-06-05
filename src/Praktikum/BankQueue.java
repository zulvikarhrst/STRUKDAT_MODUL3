package Praktikum;

public class BankQueue {
    private Node front, rear;
    private int size;

    private class Node {
        String namaNasabah;
        int nomorRekening;
        Node next;

        public Node(String namaNasabah, int nomorRekening) {
            this.namaNasabah = namaNasabah;
            this.nomorRekening = nomorRekening;
            this.next = null;
        }
    }
    //menambahkan data baru ke dalam antrian
    public void enqueue(String namaNasabah, int nomorRekening) {
        Node node = new Node(namaNasabah, nomorRekening);

        if (rear == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println(namaNasabah + " telah ditambahkan ke antrian.");
    }

    //delete elemen pertama
    public void dequeue() {
        if (front == null) {
            
            System.out.println("Antrian kosong.");
            return;
        }
        String namaNasabah = front.namaNasabah;
        int nomorRekening = front.nomorRekening;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println(namaNasabah + " dengan nomor rekening " + nomorRekening + " telah dilayani.");
    }
    //melihat elemen pertama (front) dari antrian tanpa menghapusnya
    public void peek() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Nasabah selanjutnya: " + front.namaNasabah + " dengan nomor rekening " + front.nomorRekening);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
}


