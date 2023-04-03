package com.codegym.AddElementInArray;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = input.nextInt();
        }
        System.out.print("Mảng đã nhập là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        System.out.println("Nhập phần tử cần chèn:");
        int X = input.nextInt();
        System.out.println("Nhập vị trí phần tử cần chèn:");
        int index = input.nextInt();
        int[] array = new int[number];
        if (index <= -1 && index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i < index) {
                    for (int j = i; j < index; j++) {
                        array[i] = arr[j];
                        break;
                    }
                }else
                if (index == i) {
                    array[i] = X;
                } else {
                    for (int j = i-1; j < arr.length; j++) {
                        array[i] = arr[j];
                        break;
                    }
                }
            }
            System.out.print("Mảng sau khi thêm là : ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println("");
        }
    }
}
