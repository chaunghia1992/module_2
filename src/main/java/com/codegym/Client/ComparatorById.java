package com.codegym.Client;

import java.util.Comparator;

public class ComparatorById implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        if (o1.getId() > o2.getId()){
            return 1;
        }else if (o1.getId() == o2.getId()){
            return 0;
        }else {
            return -1;
        }
    }
}
