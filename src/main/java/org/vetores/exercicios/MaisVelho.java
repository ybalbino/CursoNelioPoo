package org.vetores.exercicios;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");

        int n = sc.nextInt();
        int maiorIdade, posicaoMaior;

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaior = 0;
        for (int i=0; i<n; i++){
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoMaior]);

        sc.close();
    }
}
