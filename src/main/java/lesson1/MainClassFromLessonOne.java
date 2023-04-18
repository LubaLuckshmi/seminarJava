//Задание
// 1Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// 2 Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
package lesson1;

import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
        //ex1();
//        ex2();
//        ex3();
  //      ex4();
//        ex5(3,5);
        ex6("Kate\tSmith\t20\nPaul\tGreen\t25\nMike\tBlack\t23\n");
    }

    //    private static void ex1(String[] args) { // cmd + alt +m -- вынести метод
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Введите Ваше имя: ");
//        String name = myScanner.nextLine();
//        System.out.printf("Привет, %s!%n", name);
//    }
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
/*
    private static void ex2() {
        int[] arr = new int[]{1,1,1,1,1,1};
        int count = 0;
        int maxValue = 0;
        for (int i: arr) {
            if (i == 1) {
            count++;
            } else {
                if (count > maxValue) {
                    maxValue = count;
                    count = 0;
                }
            }
        }
        if (count > max_value) max_value = count;
        System.out.println(max_value);
    }
*/
    //    Задача 3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

    // cmd + shift + стрелка -- двигает метод
  /*  private static void ex3() {
        int[] nums = new int[]{3, 2, 3, 2, 3}; // {
        int val = 3;
        int temp = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++)
                if (nums[j] == val) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
*/

    //    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
    private static void ex4() {
        String str = "Добро пожаловать на курс по Java";
        String[] words = str.split(" ");
        String temp = "";
        for (int i = 0; i < words.length / 2; i++) {
            temp = words[i];
            words[i] = words[words.length - i -1];
            words[words.length - i - 1] = temp;
        }
        for (String j : words) {
            System.out.print(j + " ");
        }
    }
//    Реализовать функцию возведения числа а в степень b. a, b из Z.
//    Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1

    private static void ex5(int a, int b) {
        System.out.println(Math.pow(a, b));
    }
/*Записать в файл следующие данные:

Name Surname Age
Kate Smith 20
Paul Green 25
Mike Black 23

*/
    private static void ex6(String str) {
        try (FileWriter fw = new FileWriter("GB_java_s01.txt", Charset.forName("UTF-8"), false)) {
            fw.write("Name\tSurname\tAge\n");
            fw.append(str);
            fw.flush();

        } catch (Exception ex) {
            System.out.println("Some error: " + ex.getMessage());
        }

    }
}