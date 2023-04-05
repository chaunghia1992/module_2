package com.codegym.Circle;
public class Cylinder extends Circle {
    private double height = 2;
    public Cylinder() {

    };
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public void setHeight( double height){
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getArea() {
        return super.getArea()*this.height;
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + super.getRadius()
                + ", Color: "
                + super.getColor()
                + ", Height: "
                + getHeight();
    }
}