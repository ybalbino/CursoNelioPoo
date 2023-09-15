package org.exercicioSection8.exercicio03.entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notafinal(){
        return nota1 + nota2 + nota3;
    }

    public double aprovadoReprovado(){
        if (notafinal() < 60.00){
            return 60.00 - notafinal();
        } else {
            return 0.0;
        }
    }
}
