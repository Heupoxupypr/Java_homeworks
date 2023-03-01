// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package java_projects.Java_homeworks.Homework_2.Task_2;

import java.util.Scanner; //модуль для получения данных из терминала
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class program {
    // private static int[] arr;

    public static void main(String[] args) {

    }

    public static int[] args_data(String[] data) throws FileNotFoundException, IOException {
        if (data.length > 0) {
            if (data[0].equals("-f")) {
                System.out.printf("file name: %s\n", data[1]);
                int[] arr = { 0 };
                try (BufferedReader br = new BufferedReader(new FileReader(data[1]))) {
                    String str;
                    while ((str = br.readLine()) != null) {
                        System.out.printf("== %s ==\n", str);
                        String[] datastr = str.split(" ");
                        arr = new int[datastr.length];
                        for (int i = 0; i < arr.length; i++) {
                            arr[i] = Integer.parseInt(datastr[i]);
                            if (arr[i] % 2 != 0) {
                                System.out.printf("%d ", arr[i]);
                            }
                        }
                        System.out.println();
                    }
                    br.close();
                    return arr;
                }
            } else if (data[0].equals("-d")) {
                System.out.printf("Data: ");
                for (int i = 1; i < data.length; i++) {
                    System.out.printf("%s ", data[i]);
                }
                System.out.println();

                int[] arr = new int[data.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(data[i + 1]);
                    if (arr[i] % 2 != 0) {
                        System.out.printf("%d ", arr[i]);
                    }
                }
                System.out.println();
                return arr;

            }
        }

        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("Please enter massive: ");
            String array = iScanner.nextLine();
            System.out.printf("Entered Data: %s\n", array);

            String[] str = array.split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
                if (arr[i] % 2 != 0) {
                    System.out.printf("%d ", arr[i]);
                }
            }
            System.out.println();
            return arr;
        }

    }
}
