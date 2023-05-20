package lesson6;
/*1. Напишите метод, который заполнит массив из 1000 элементов
случайными цифрами от 0 до 24.

        2. Создайте метод, в который передайте заполненный
        выше массив и с помощью Set вычислите процент
        уникальных значений в данном массиве и верните его
        в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных
        чисел * 100 / общее количество чисел в массиве.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        int[] arr = getArray();
        System.out.println(getPercentUniqElement(arr));
    }

    private static int[] getArray() {
        int[] array = new int[1000];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(0, 25);
        }
        return array;
    }

    private static Double getPercentUniqElement(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : array) {
            set.add(number);
        }
        int setLen = set.size();
        Double result = setLen * 100.0 / array.length;
        return result;
    }
}

