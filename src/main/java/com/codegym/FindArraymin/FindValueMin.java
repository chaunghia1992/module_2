package com.codegym.FindArraymin;


    import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

    public class FindValueMin {
        public static double findMinValue(int[] array) {
            double min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int size;
            do {
                System.out.print("Enter size of the array: ");
                size = input.nextInt();
                if (size < 1) {
                    System.out.println("Size is not less than 1. Try again!");
                }
            } while (size < 1);

            int arr[];
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter value of element %d: ", i + 1);
                arr[i] = input.nextInt();
            }
            System.out.println("Your entered array: " + Arrays.toString(arr));

            System.out.println("Min value in your array is: " + findMinValue(arr));
        }
    }

