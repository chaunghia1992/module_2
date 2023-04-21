package product1.utils;


import product1.model.Farm;

import java.util.Comparator;

public class PriceSortDESC implements Comparator<Farm> {
    @Override
    public int compare(Farm o1, Farm o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
