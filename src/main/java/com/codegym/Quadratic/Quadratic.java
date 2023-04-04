package com.codegym.Quadratic;

public class Quadratic {
    private double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public static void main(String[] args) {
        Quadratic equation = new Quadratic(1, -5, 6);
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}

