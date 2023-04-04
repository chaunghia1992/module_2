package  com.codegym.Comparator;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) { //so sánh 01 và 02 nếu > 0 thì 01 lớn hơn 02
            return 1;
        } else if (o1.getSalary() == o2.getSalary()) { // neu 01 = 0 thì 01 = 02
            return 0;
        }else {
            return -1;
        }
    }
}
