package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Calculator<T> {
    public Double sum(List<? extends Number> items) {
        double sum = 0;
        for (Number i : items)
            sum += i.doubleValue();
        return sum;
    }

    public Double multiplication(List<? extends Number> items) {
        double mult = 1;
        for (Number i : items)
            mult *= i.doubleValue();
        return mult;
    }

    public Double division(List<? extends Number> items) {
        double div = 1;
        for (int i = 0; i < items.size(); i++) {
            if (i == 0)
                div = items.get(i).doubleValue();
            div /= items.get(i).doubleValue();
        }
        return div;
    }

    private ArrayList Convertation(Number dig, boolean part) {
        ArrayList binariDigit = new ArrayList<>();
        if (part) {
            while (dig.intValue() >= 2) {
                binariDigit.add(dig.intValue() - (dig.intValue() / 2) * 2);
                dig = dig.intValue() / 2;
            }
            binariDigit.add(dig.intValue());
            Collections.reverse(binariDigit);
        } else {
            String[] a = String.valueOf(dig.doubleValue()).split("[.]");
            while (Double.parseDouble(a[1]) > 0) {
                dig = dig.doubleValue() * 2;
                a = String.valueOf(dig.doubleValue()).split("[.]");
                binariDigit.add(Integer.parseInt(a[0]));
                if (dig.doubleValue() > 1) {
                    dig = dig.doubleValue() - 1;
                }
                if (binariDigit.size() >= 7)
                    break;
            }
        }


        return binariDigit;
    }

    public void binaryTranformation(T num) {
        Integer base = 0;
        Double fract = (double) 0;
        Double dig;
        if (num instanceof String) {
            String[] a = String.valueOf(num).split("[.]");
            base = Integer.parseInt(a[0]);
//            fract = Integer.parseInt(a[1]);
            fract = (Double) num - base;
        } else {
            String[] a = String.valueOf(num).split("[.]");
            base = Integer.parseInt(a[0]);
//            fract = Integer.parseInt(a[1]);
            fract = (Double) num - base;
        }

        System.out.println("Base: " + base + " Fract: " + fract);
        System.out.println("Binary Base: " + Convertation(base, true) + " Binary Fract: " + Convertation(fract, false));
    }
}
