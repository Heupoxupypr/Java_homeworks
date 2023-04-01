package org.example;

import java.util.List;

public class Calculator {
    public Double sum (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum += i.doubleValue();
        return sum;
    }

    public Double multiplication (List<? extends Number> items){
        double mult = 1;
        for (Number i: items)
            mult *= i.doubleValue();
        return mult;
    }

    public Double division (List<? extends Number> items){
        double div = 1;
        for (int i = 0; i < items.size(); i++) {
            if (i == 0)
                div = items.get(i).doubleValue();
            div /= items.get(i).doubleValue();
        }
        return div;
    }
}
