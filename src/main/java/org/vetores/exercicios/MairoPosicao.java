package org.vetores.exercicios;

import java.util.Scanner;

public class MairoPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int posMaior;
        double maior;

        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        maior = vect[0];
        posMaior = 0;

        for (int i = 1; i < n; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

        sc.close();
    }
}
