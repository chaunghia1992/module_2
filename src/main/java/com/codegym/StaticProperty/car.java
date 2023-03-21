package com.codegym.StaticProperty;

public class car {
    private  String name;
    private String engine;

    public static int numberofcars;
    public  car (String name , String engine){
        this.name = name;
        this.engine =engine;
        numberofcars++;
    }
}
