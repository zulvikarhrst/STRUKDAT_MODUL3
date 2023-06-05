package Praktikum;

import Praktikum.BankQueue;
import java.util.Scanner;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        BankQueue queue = new BankQueue();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n=== Antrian Bank ===");
            System.out.println("1. Tambah Nasabah ke Antrian");
            System.out.println("2. Layani Nasabah Berikutnya");
            System.out.println("3. Lihat Ukuran Antrian");
            System.out.println("4. Lihat Nasabah Berikutnya di Antrian");
            System.out.println("5. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Nasabah: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Nomor Rekening Nasabah: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    queue.enqueue(name, accountNumber);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Ukuran Antrian: " + queue.size());
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan sistem Antrian Bank.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Mohon pilih lagi.");
                    break;
            }
        }
    }

}
