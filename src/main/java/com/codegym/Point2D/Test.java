package com.codegym.Point2D;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D firstPoint3D = new Point3D(3,4,7);
        System.out.println(firstPoint3D);
        System.out.println(Arrays.toString(firstPoint3D.getXYZ()));
        firstPoint3D.setXYZ(2,2,9);
        System.out.println(Arrays.toString(firstPoint3D.getXYZ()));
    }
}
