package org.vetores.exercicios;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] result = new int[n];

        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            result[i] = a[i] + b[i];
        }
        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", result[i]);
        }

        sc.close();
    }
}
