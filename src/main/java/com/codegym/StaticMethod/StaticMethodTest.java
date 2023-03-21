package com.codegym.StaticMethod;

public class StaticMethodTest {
    public static void main(String[] args){
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(1, "Hoang");
        StaticMethod s2 = new StaticMethod( 2,"Khanh");
        StaticMethod s3 = new StaticMethod( 3,"Nam");
        s1.display();
        s2.display();
        s3.display();

    }
}
