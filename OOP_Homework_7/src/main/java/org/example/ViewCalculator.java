package org.example;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double ArgA = promptDouble("Введите вещественную часть комплексного числа: ");
            double ArgI= promptDouble("Введите мнимую часть комплексного числа: ");
            Calculable calculator = calculableFactory.create(ArgA, ArgI);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    double argA = promptInt("Введите вещественную часть второго комплексного числа:: ");
                    double argI = promptInt("Введите мнимую часть второго комплексного числа:: ");
                    calculator.multi(argA, argI);
                    continue;
                }
                if (cmd.equals("+")) {
                    double argA = promptInt("Введите вещественную часть второго комплексного числа:: ");
                    double argI = promptInt("Введите мнимую часть второго комплексного числа:: ");
                    calculator.sum(argA, argI);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println("Результат " + calculator.getResult());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
