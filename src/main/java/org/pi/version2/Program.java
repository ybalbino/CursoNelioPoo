package org.pi.version2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculetor calculetor = new Calculetor();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculetor.circumference(radius);

        double v = calculetor.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calculetor.PI);

        sc.close();
    }
}
