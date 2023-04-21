package product1.utils;

import product1.model.Farm;

import java.util.Comparator;

public class PriceSortASC implements Comparator<Farm> {
    @Override
    public int compare(Farm o1, Farm o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}