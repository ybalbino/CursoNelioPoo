package org.exercicioSection8.exercicio02.aplication;

import org.exercicioSection8.exercicio02.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated date: " + employee);

        sc.close();
    }
}
