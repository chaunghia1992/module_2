package com.codegym.Shape;

public class Circle extends Shape{
    private final double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        double radius1 = this.radius;
    }
    public Circle(double radius , String color , boolean filled ){
        super(color,filled);
        double radius1 = this.radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return " A Circle with radius="
                +getRadius()
                +", Which is a subclass of"
                + super.toString();
    }
}
