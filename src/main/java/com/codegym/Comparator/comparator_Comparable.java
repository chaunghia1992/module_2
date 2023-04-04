package com.codegym.Comparator;

import java.util.Comparator;

public class comparator_Comparable {

    public class CompareByAge implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge()==o2.getAge()) {
                return 0;
            }else{
                return -1;
            }

        }
    }

}
