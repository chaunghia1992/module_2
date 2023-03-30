package com.codegym.client;

import java.util.Comparator;

public class ComparatorById implements Comparator<client> {

    @Override
    public int compare(client o1, client o2) {
        if (o1.getId() > o2.getId()){
            return 1;
        }else if (o1.getId() == o2.getId()){
            return 0;
        }else {
            return -1;
        }
    }
}
