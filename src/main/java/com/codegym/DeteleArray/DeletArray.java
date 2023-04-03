package com.codegym.DeteleArray;


import java.util.Scanner;

public class DeletArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i <arr.length; i++ ){
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = input.nextInt();
        }
        System.out.print("Mảng đã nhập là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        System.out.println("Nhập giá trị bạn muốn xóa khỏi mảng: ");
        int X = input.nextInt();
        int k, index_del;
        for (index_del = k = 0; k < arr.length; k++) {
            if (X != arr[k]) {
                arr[index_del] = arr[k];
                index_del ++;
            }
        }
        for (int l = arr.length -1; l >= index_del; l--){
            arr[l] = 0;
        }
        System.out.print("Mảng sau khi xóa là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}