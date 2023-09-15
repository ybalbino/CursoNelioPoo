package org.exercicioSection8.exercicioFixacao.entities;

public class CurrencyConverter {
    public double dolar;
    public double quantidadeDolar;
    public double tax = 6.0;


    public double conversaoDolar(){
        return dolar * quantidadeDolar;
    }

    public double valorFinal(){
        return (tax * conversaoDolar()/100) + conversaoDolar();
    }


}
