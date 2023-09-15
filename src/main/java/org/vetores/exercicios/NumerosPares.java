package org.vetores.exercicios;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, quantPar;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect [i] = sc.nextInt();
        }
        System.out.println("\nNUMEROS PARES: ");

        quantPar = 0;
        for (int i=0; i<n; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                quantPar++;
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantPar);

        sc.close();
    }
}
