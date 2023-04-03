package com.codegym.FindArray;
import java.util.Scanner;
public class FindArray {

    public static class findArray {

        public static void main(String[] args) {
            int[][] arrayDb = creatArray();
            new findArray(arrayDb);
        }
        public static int[][] creatArray() {
            Scanner input = new Scanner(System.in);
            int[][] arr = new int[5][5];
            System.out.println("Nhập phần tử của mảng: ");
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println("Phần tử ở vị trí " + i + "-" + j + ":");
                    arr[i][j] = input.nextInt();
                }
            }
            return arr;
        }
        public findArray(int[][] array) {
            int max = array[0][0];
            int x = 0;
            int y = 0;
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println("Giá trị lớn nhất của mảng là " + max + " ở vị trí " + x + "-" + y);
        }
    }

}
