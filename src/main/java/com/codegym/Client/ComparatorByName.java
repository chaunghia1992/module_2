package com.codegym.Client;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Client>{
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        String a1 = "aQuang";
        String a2 = "dQuang";
        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a1));

    }
}
