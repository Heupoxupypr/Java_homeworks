package org.example;

import java.util.List;

public class Calculator {
    public Double sum (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum += i.doubleValue();
        return sum;
    }
}
