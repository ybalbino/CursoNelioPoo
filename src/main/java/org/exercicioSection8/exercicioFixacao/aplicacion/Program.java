package org.exercicioSection8.exercicioFixacao.aplicacion;

import org.exercicioSection8.exercicioFixacao.entities.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        currencyConverter.dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        currencyConverter.quantidadeDolar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n" , currencyConverter.valorFinal());

        sc.close();
    }
}
