package org.vetores.exercicios;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double soma, media;
        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i=0; i<n; i++){
            soma = soma + vect[i];
        }

        media = soma/n;
        System.out.printf("\nMEDIA DO VETOR: %.3f\n", media);
        System.out.printf("ELEMENTOS ABAIXO DA MEDIA: \n");

        for (int i=0; i<n; i++){
            if (vect[i] < media){
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        sc.close();
    }
}
