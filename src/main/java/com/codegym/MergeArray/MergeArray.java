package com.codegym.MergeArray;
import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value in element arr1: " + i);
            int e = scanner.nextInt();
            arr1[i] = e;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter value in element arr2: " + i);
            int e = scanner.nextInt();
            arr2[i] = e;
        }
        int arr3[] = new int[10];
        for (int i = 0; i < arr3.length/2; i++) {
            arr3[i] = arr1[i];
            arr3[i+5] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
