// +Написать программу вычисления n-ого треугольного числа.

package java_projects.Java_homeworks.Homework_1;

import java.util.Scanner; //модуль для получения данных из терминала

public class program {
    public static void main(String[] args) {

        int n = GetNumber("Please enter number of triangle number: ");
        
        System.out.printf("Triangle number of %d is %d", n, GetTriangleNumber(n));       
    }

    public static int GetNumber(String message) {
        System.out.println(message);
        try (Scanner iScanner = new Scanner(System.in)) {
            int n = Integer.parseInt(iScanner.nextLine());
            return n;
        }
    }

    public static int GetTriangleNumber(int number) {
        number = (number * (number + 1)) / 2;
        return number;
    }
}
