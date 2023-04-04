package com.codegym;

public class Test {
    public static void main(String[] args) {
        System.out.println(giaithua(5));
    }

    public static int giaithua(int number) {
        int result = 1;
        if (number > 0) {result = number * giaithua(number -1);
        }
        return result;
    }
}
