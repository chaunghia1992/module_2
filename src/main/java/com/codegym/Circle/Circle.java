package com.codegym.Circle;

public class Circle {
    private double radius = 2;
    private String color = "blue";
    public Circle () {

    };
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", Color: "
                + getColor();
    }
}
