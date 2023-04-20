package org.example;

public class Factory implements ICalculableFactory{

    @Override
    public Calculable create(double ArgA, double ArgI) {
//        new LogCal().loggerOut("" + primaryArg);
        return new LogCalculator(ArgA, ArgI, new Log());
    }

}
