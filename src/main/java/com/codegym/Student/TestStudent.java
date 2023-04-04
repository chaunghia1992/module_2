package com.codegym.Student;

public class TestStudent {
    public static void main(String[] args){
        Student stu1;
        Student student = stu1 = new Student();
        stu1.setname("gorge");
        stu1.setclasses("G06");
        System.out.println("Name : " + " classes: "+ stu1.toString());
    }
}
