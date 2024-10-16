package PraktikumPBO.Sesi4;

import java.util.Scanner;

public class ProgramWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk batas perulangan
        System.out.print("MASUKKAN BATAS PERULANGAN: ");
        int batas = scanner.nextInt();

        int i = 0;
        while (i < batas) {
            System.out.println("PERULANGAN KE: " + i);
            i++;
        }

        scanner.close();
    }
}
