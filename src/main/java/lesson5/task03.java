package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
 * <p>
 * Написать метод, который переведёт данное целое число в римский формат.
 * <p>
 * IV - 4
 * VII - 7
 * - I = 1
 * - V = 5
 * - X = 10
 * - L = 50
 * - C = 100
 * - D = 500
 * - M = 1000
 */
public class task03 {
    public static void main(String[] args) {
        ex03();
    }

    private static void ex03() {
        System.out.println("Введите римское число: ");
        Scanner myScanner = new Scanner(System.in);
        String romanNumber = myScanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int current = map.get(romanNumber.charAt(i));
            int prev = i == 0 ? 0 : map.get(romanNumber.charAt(i - 1));
            if (i > 0 && current > prev) {
                result -= prev;
                result += current - prev;
            } else {
                result += current;
            }
        }
        System.out.printf("Арабский формат: %d%nиз римского: %s", result, romanNumber);

    }
}
