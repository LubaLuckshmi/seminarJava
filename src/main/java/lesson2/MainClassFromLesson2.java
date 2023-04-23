package lesson2;

import java.util.Scanner;

public class MainClassFromLesson2 {
    public static void main(String[] args) {
        // ex1();
//        ex2();
        ex3();
    }



    /* Дано число N (>0) и символы c1 и c2.
         Написать метод, который вернет строку длины N,
         которая состоит из чередующихся символов c1 и c2,
          начиная с c1.
 */
    private static void ex1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите количество символов: ");
        int n = Integer.parseInt(myScanner.nextLine());
        System.out.println("Введите Символ С1: ");
        String c1 = myScanner.nextLine();
        System.out.println("Введите Символ С2: ");
        String c2 = myScanner.nextLine();
        String result = " ";
        String temp = c1;
        for (int i = 0; i < n; i++) {
            if (temp == c1) {
                result += c2;
                temp = c2;
            } else {
                result += c1;
                temp = c1;
            }

        }
        System.out.println(result);
    }

    //     решение через стринбилдер
    private static void ex2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите количество символов: ");
        int n = myScanner.nextInt();
        String[] c = new String[]{"A", "b"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(c[i%2]);
        }
        System.out.println(result);
    }
//    Через метод repeat
    private static void ex3() {
        char a = 'A';
        char b = 'b';
        int n = 5;
        String str = "" + a + b;
        str = str.repeat(n/2) + ((n%2 == 1) ? a : "");
        System.out.println(str);
    }
}
