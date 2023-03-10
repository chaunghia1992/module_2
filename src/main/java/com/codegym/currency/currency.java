package com.codegym.currency;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        // Step 2
        float rate = 23000;

        // Step 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in USD: ");
        float usd = scanner.nextFloat();

        // Step 4
        float vnd = usd * rate;
        System.out.println("The value in VND is: " + vnd);
    }
}

