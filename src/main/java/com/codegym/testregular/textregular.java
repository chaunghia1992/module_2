package com.codegym.pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class textregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input txt: ");
        String txt = sc.nextLine();
        System.out.println();
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        if (p.matcher(txt).find()){
            System.out.println("txt ok");

        }else {
            System.err.println("txt not ok");
        }

    }
    }

