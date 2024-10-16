package PraktikumPBO.Sesi5;

import java.util.Scanner;

public class ProgramAngka0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
        
        do {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti): ");
            angka = scanner.nextInt();
        } while (angka != 0);
        
        System.out.println("Program selesai.");
    }
}

