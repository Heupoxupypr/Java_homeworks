package org.example;

public class LogCalculator implements Calculable{

    private double ArgA;
    private double ArgI;
    private Log logger;

    public LogCalculator(double ArgA, double ArgI, Log logger) {
        this.logger = logger;
        this.ArgA = ArgA;
        this.ArgI = ArgI;
        if(ArgI > 0) {
            logger.loggerOut("" + ArgA + " + " +  ArgI + "i");
        }
        if (ArgI == 0){
            logger.loggerOut("" + ArgA);
        }
        if (ArgI < 0){
            logger.loggerOut("" + ArgA + " " +  ArgI + "i");
        }
    }


    @Override
    public Calculable sum(double argA, double argI) {
        if(argI > 0) {
            logger.loggerOut("" + argA + " + " +  argI + "i");
        }
        if (argI == 0){
            logger.loggerOut("" + argA);
        }
        if (argI < 0){
            logger.loggerOut("" + argA + " " +  argI + "i");
        }
        ArgA += argA;
        ArgI += argI;
        return this;
    }

    @Override
    public Calculable multi(double argA, double argI) {
        if(argI > 0) {
            logger.loggerOut("" + argA + " + " +  argI + "i");
        }
        if (argI == 0){
            logger.loggerOut("" + argA);
        }
        if (argI < 0){
            logger.loggerOut("" + argA + " " +  argI + "i");
        }
        ArgA *= argA;
        ArgI *= argI;
        return this;
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

    @Override
    public String getResult() {
        if(ArgI > 0) {
            logger.loggerOut("" + ArgA + " + " +  ArgI + "i");
        }
        if (ArgI == 0){
            logger.loggerOut("" + ArgA);
        }
        if (ArgI < 0){
            logger.loggerOut("" + ArgA + " " +  ArgI + "i");
        }
        return this.toString();
    }
}
