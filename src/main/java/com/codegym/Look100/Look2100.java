package com.codegym.Look100;

public class Look2100 {
    public static void main(String[] args){
        int point = 0;
        int count = 0;
        System.out.println("các số nguyên tố từ 2 đến 100:");
        for (int  N = 2 ; N <100; N++){
            if(point < 100){
                for (int  j = 1 ; j <= N; j ++){
                    if (N % j == 0){
                        count += 1;
                    }
                }
                if (count == 2 ){
                    System.out.println(N);
                }
                count = 0;
            }else {
                break;
            }
        }
    }

}
