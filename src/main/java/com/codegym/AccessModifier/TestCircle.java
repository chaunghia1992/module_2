package com.codegym.AccessModifier;

public class TestCircle {
    public static void main(String[] args){
        Circle circle = new Circle(5,"red");
        circle.setColor("blue");
        System.out.println("Radius: " + circle.getRadius() + "Color : " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

    }
}
