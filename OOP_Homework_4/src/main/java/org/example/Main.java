package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Calc<Integer> calc1 = new Calc<>();
//        System.out.println(calc1.sum(new ArrayList<>(Arrays.asList(1,2,3))));
//        Calc<Double> calc2 = new Calc<>();
//        System.out.println(calc2.sum(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));

        Calculator calc3 = new Calculator();
        System.out.println(calc3.sum(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
        System.out.println(calc3.multiplication(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
        System.out.println(calc3.division(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
    }
}