package com.codegym.student;

public class Teststudent {
    public static void main(String[] args){
        student stu1;
        student student = stu1 = new student();
        stu1.setname("gorge");
        stu1.setclasses("G06");
        System.out.println("Name : " + " classes: "+ stu1.toString());
    }
}
