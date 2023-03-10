package com.codegym.showgreetings;
import java.util.Scanner;
public class showgreetings {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);

    }
}