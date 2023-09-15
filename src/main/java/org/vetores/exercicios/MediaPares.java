package org.vetores.exercicios;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int somaPares = 0;
        int numPares = 0;
        double mediaPares;

        int[] vect = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (vect[i] % 2==0){
                somaPares = somaPares + vect[i];
                numPares++;
            }
        }
        if (numPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = (double) somaPares/numPares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }


        sc.close();
    }
}
