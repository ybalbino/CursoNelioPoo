package org.vetores.exercicios;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        double media;

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i=0; i<n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados: ");
        for (int i=0; i<n; i++){
            media = (nota1[i] + nota2[i])/2;

            if (media>= 6.0){
                System.out.printf("%s\n", nomes[i]);
            }
        }
        sc.close();
    }
}
