// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package java_projects.Java_homeworks.Homework_2.Task_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_1 {

    public static String sql = "select * from students where";
    public static void main(String[] args) throws FileNotFoundException {
        // String sql = "select * from students where";
        BufferedReader br = new BufferedReader(ReadFile("Task_1.json"));
        String str = null;
        
        try {
            while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);
                String[] datastr = str.split("\"");

                SqlStrModif(datastr);
 
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(sql);

    }

    public static FileReader ReadFile(String filename) throws FileNotFoundException {
        return new FileReader(filename);
    }

    public static void SqlStrModif(String[] data) {
        
        StringBuilder sb = new StringBuilder(sql);

        int firstappend_flag = 0;

        for (int i = 0; i < data.length; i++) {
            if ((data[i].equals("name")) || (data[i].equals("country")) || 
            (data[i].equals("city")) || (data[i].equals("age"))) {
                if (!data[i+2].equals("null")) {
                    if (firstappend_flag == 1){
                        sb.append (" ").append ("AND").append (" ").append(data[i]).append("='").append(data[i+2]).append("'");
                    } else {
                        sb.append (" ").append(data[i]).append("='").append(data[i+2]).append("'");
                        firstappend_flag =1;
                    }
                    
                    
                    i+=2;
                }
                
            }
        }
        sql = sb.toString();
        // System.out.println(sql);
                        
    }
}
