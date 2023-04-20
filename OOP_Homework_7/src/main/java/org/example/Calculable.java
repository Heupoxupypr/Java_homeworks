package org.example;

public interface Calculable {
    Calculable sum(double argA, double argI);
    Calculable multi(double argA, double argI);
    String getResult();
}
