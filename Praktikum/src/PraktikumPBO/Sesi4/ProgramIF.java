package PraktikumPBO.Sesi4;

import java.util.Scanner;

public class ProgramIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("MASUKKAN SEBUAH ANGKA: ");
        int num = scanner.nextInt();

        // Mengecek apakah angka positif atau negatif
        if (num > 0) {
            System.out.println("ANGKA POSITIF");
        } else if (num < 0) {
            System.out.println("ANGKA NEGATIF");
        } else {
            System.out.println("ANGKA NOL");
        }

        scanner.close();
    }
}
