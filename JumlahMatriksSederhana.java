package UKL;

import java.util.Scanner;

public class JumlahMatriksSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                A[i][j] = input.nextInt();

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                B[i][j] = input.nextInt();

        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++)
                System.out.print((A[i][j] + B[i][j]));
            System.out.println();
        }
    }
}

