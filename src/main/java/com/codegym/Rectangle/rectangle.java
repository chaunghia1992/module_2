package com.codegym.Rectangle;

import java.util.Scanner;

public class rectangle {
    double width, height;
    public rectangle(){
    }
    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getAreA(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "rectangle{" + "width=" + width + ",height=" + height + "}";


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        rectangle rectangle = new rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getAreA());

    }
}
