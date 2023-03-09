package java_projects.Java_homeworks.Homework_4;

import java.util.Scanner; //модуль для получения данных из терминала
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.logging.*; //модуль для логггирования
//import java.util.ArrayList;
import java.util.Arrays; //для преобразования численного массива в строку
//import java.util.List; // Коллекция для работы с листами

public class program {

    private static Logger log = Logger.getLogger(program.class.getName());
    

    public static void main(String[] args) {
        try {
            // bubble_sort(args_data(args));
            System.out.println("Sorted array: "+Arrays.toString(sort(args_data(args))));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                    // if (arr[i] % 2 != 0) {
                    // System.out.printf("%d ", arr[i]);
                    // }
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
                // if (arr[i] % 2 != 0) {
                // System.out.printf("%d ", arr[i]);
                // }
            }
            System.out.println();
            return arr;
        }

    }

    public static int[] bubble_sort(int[] data) throws SecurityException, IOException {
        log.setLevel(Level.INFO); // Set level logging INFO
        FileHandler fh = new FileHandler("logs.txt"); // create handler for logs
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter(); // Set format for logs
        fh.setFormatter(sFormat);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int t = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = t;
                }
                log.logp(Level.INFO, program.class.getName(), new Throwable()
                        .getStackTrace()[0]
                        .getMethodName(), "Iteration: " + Arrays.toString(data));
            }
        }
        return data;
    }

    public static int[] sort(int[] data) throws SecurityException, IOException {
        int[] dt = Arrays.copyOf(data, data.length);;
        int[] d = Arrays.copyOf(dt, dt.length);

        log.setLevel(Level.INFO); // Set level logging INFO
        FileHandler fh = new FileHandler("logs.txt"); // create handler for logs
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter(); // Set format for logs
        fh.setFormatter(sFormat);

        mergeSort(dt, d, 0, data.length - 1 );

        

        return dt;

    }

    public static void mergeSort(int[] dt, int[] d, int first_el, int last_el ) throws SecurityException, IOException {
        if (first_el == last_el) {  //Если размер массива равен 1
            return;
        }

        int middle = first_el + ((last_el - first_el) >> 1); //находим середину массива
        

        mergeSort(dt, d, first_el, middle); //разделяем левую часть
        mergeSort(dt, d, middle + 1, last_el); //разделяем правую часть

        merge(dt, d, first_el, middle, last_el);
        
    }

    public static void merge(int[] dt, int[] d, int first, int mid, int last ) throws SecurityException, IOException {
        int i = first; //счетчик для левой части основного массива
        int j = mid + 1; //счетчик для правой части основного массива
        int k = first; //счетчик для общего массива

        
        

        
        while ((i <= mid) && (j <= last)) { //сравниваем элементы в левой и правой частях и записываем в буферный список
            if (dt[i] <= dt[j]){
               d[k++] = dt[i++];
            }
            else {
                d[k++] = dt[j++];
            }
        }
        
        //копируем оставшееся
        while (i <= mid) {
            d[k++] = dt[i++];
        }

        // System.out.println(Arrays.toString(d));

        for (i = first; i <= last; i++) {
            dt[i] = d[i];
        }

        log.logp(Level.INFO, program.class.getName(), new Throwable()
                        .getStackTrace()[0]
                        .getMethodName(), "Iteration: " + Arrays.toString(dt));

    }
}
