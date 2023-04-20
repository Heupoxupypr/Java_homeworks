package org.example;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(double ArgA, double ArgI) {
        return new Calculator(ArgA, ArgI);
    }
}
