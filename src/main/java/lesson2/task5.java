package lesson2;

/*Напишите метод, который вернет содержимое текущей папки в
виде массива строк.
        Напишите метод, который запишет массив, возвращенный
        предыдущим методом в файл.
        Обработайте ошибки с помощью try-catch конструкции.
        В случае возникновения исключения, оно должно записаться
        в лог-файл.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class task5 {
    public static void main(String[] args) {
        ex5("/Users/admin/Desktop/java project/семинар/java-praktic20230418");

    }

    private static void ex5(String pathDir) {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())) {
            return;
        };
        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()) {
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);


        try (PrintWriter  pw = new PrintWriter("src/main/resources/files/filesName.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
