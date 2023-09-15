package org.pi.version2;

public class Calculetor {
    public final double PI = 3.14159;

    public double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3;
    }
}
