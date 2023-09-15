package org.vetores.exercicios;

import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        int quantHomens, quantMulheres;
        double menorAltura, maiorAltura, medAltFem, altFemTotal;

        double[] alturas = new double[n];
        char[] genero = new char[n];

        for (int i=0; i<n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = sc.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];
        for (int i=0; i<n; i++){
            if (alturas[i]>maiorAltura){
                maiorAltura = alturas[i];
            }
            if (alturas[i]<menorAltura){
                menorAltura = alturas[i];
            }
        }

        quantMulheres = 0;
        quantHomens = 0;
        altFemTotal = 0;
        for (int i=0; i<n; i++){
            if (genero[i]=='M'){
                quantHomens++;
            }else {
                quantMulheres++;
                altFemTotal = altFemTotal + alturas[i];
            }
        }

        medAltFem = altFemTotal/quantMulheres;
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", medAltFem);
        System.out.printf("Numero de homens = %d\n", quantHomens);

        sc.close();
    }
}
