package com.codegym.Circle;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(3,"yellow",6);
        System.out.println(cylinder1);

        System.out.println(cylinder1.getArea());
    }
}
