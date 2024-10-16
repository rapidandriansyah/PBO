package PraktikumPBO.Sesi5;

import java.util.Scanner;

public class ProgramPositifNegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("MASUKKAN SEBUAH ANGKA: ");
        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println("ANGKA POSITIF.");
        } else if (angka < 0) {
            System.out.println("ANGKA NEGATIF.");
        } else {
            System.out.println("ANGKA NOL.");
        }
    }
}
