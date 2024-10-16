package PraktikumPBO.Sesi4;

import java.util.Scanner;

public class ProgramFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk batas perulangan
        System.out.print("MASUKKAN BATAS PERULANGANN: ");
        int batas = scanner.nextInt();

        // Perulangan berdasarkan input pengguna
        for (int i = 0; i < batas; i++) {
            System.out.println("PERULANGAN KE: " + i);
        }

        scanner.close();
    }
}

