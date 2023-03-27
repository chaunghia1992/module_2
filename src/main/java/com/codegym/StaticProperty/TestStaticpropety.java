package com.codegym.StaticProperty;

public class TestStaticpropety {
    public static void main (String[] args){
        car car1 = new car("Mazda 3","Skyactiv 3");
        System.out.println(car.numberofcars);
        car car2 = new car ("Mazda 6 ","Skyactiv 6 ");
        System.out.println(car.numberofcars);

    }

}
