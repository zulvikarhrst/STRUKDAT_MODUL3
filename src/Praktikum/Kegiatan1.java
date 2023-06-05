package Praktikum;

/**
 *
 * @author Zulvikar Harist
 */

public class Kegiatan1 {
    private static int MAX_SIZE = 100; // maksimal ukuran stack
    private static char[] stack = new char[MAX_SIZE]; // array untuk menyimpan stack
    private static int top = -1; // index dari elemen teratas stack

public static void main(String[] args) throws java.io.IOException {

    System.out.print("Masukkan string: ");
    StringBuilder str = new StringBuilder();

    while (true) {
        char c = (char) System.in.read();

        if (c == '\n') {
            break;
        }

        str.append(c);
    }

    // push setiap karakter string ke stack
    for (int i = 0; i < str.length(); i++) {
        push(str.charAt(i));
    }

    // pop setiap karakter dari stack untuk mereverse string
    StringBuilder reversedStr = new StringBuilder();
    while (!isEmpty()) {
        reversedStr.append(pop());
    }

    System.out.println("String setelah direverse: " + reversedStr.toString());
}

// menambah elemen ke stack
private static void push(char c) {
    if (top == MAX_SIZE - 1) { // stack penuh
        System.out.println("Stack penuh!");
        return;
    }

    top++;
    stack[top] = c;
}

// mengambil dan menghapus elemen teratas stack
private static char pop() {
    if (top == -1) { // stack kosong
        System.out.println("Stack kosong!");
        return '\0';
    }

    char c = stack[top];
    top--;
    return c;
}

// cek apakah stack kosong
private static boolean isEmpty() {
    return top == -1;
    }
}


