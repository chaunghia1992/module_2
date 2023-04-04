package com.codegym.AccessModifier;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double r, String color){
        this.radius = r ;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        circle.setColor("blue");
        circle.setRadius(9);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Color : " + circle.getColor());
    }
}
