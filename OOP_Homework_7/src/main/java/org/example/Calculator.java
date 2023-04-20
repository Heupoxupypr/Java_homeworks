package org.example;

public final class Calculator implements Calculable {

    private double ArgA;
    private double ArgI;

    public Calculator(double ArgA, double ArgI) {
        this.ArgA = ArgA;
        this.ArgI = ArgI;
    }

    @Override
    public Calculable sum(double argA, double argI) {
        ArgA += argA;
        ArgI += argI;
        return this;
    }

    @Override
    public Calculable multi(double argA, double argI) {
        ArgA *= argA;
        ArgI *= argI;
        return this;
    }

    @Override
    public String getResult() {
        return this.toString();
    }

    @Override
    public String toString() {
        if (ArgI == 0){
            return("" + ArgA);
        }
        if (ArgI < 0){
            return("" + ArgA + " " +  ArgI + "i");
        }
        return("" + ArgA + " + " +  ArgI + "i");
    }
}
