package com.codegym.InterestLoan;
import java.util.Scanner;
public class InterestLoan {
    public static void main(String[] args){
        double monney = 1.0;
        int month = 1 ;
        double interestloan =1.0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter investment amount:");
        monney = input.nextDouble();
        System.out.println(" Enter number of months:");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");

    }
}
