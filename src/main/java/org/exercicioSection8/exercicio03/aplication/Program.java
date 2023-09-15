package org.exercicioSection8.exercicio03.aplication;

import org.exercicioSection8.exercicio03.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.notafinal());

        if (student.notafinal() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", student.aprovadoReprovado());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
