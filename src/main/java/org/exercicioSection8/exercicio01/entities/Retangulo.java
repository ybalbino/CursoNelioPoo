package org.exercicioSection8.exercicio01.entities;

public class Retangulo {
    public double whidth;
    public double height;

    public double area(){
        return height * whidth;
    }

    public double perimeter(){
        return (height + whidth)*2;
    }

    public double diagonal(){
        return Math.sqrt (height * height + whidth * whidth);
    }
}
