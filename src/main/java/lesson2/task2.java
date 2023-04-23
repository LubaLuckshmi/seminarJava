package lesson2;

public class task2 {
    public static void main(String[] args) {
        ex2();
    }
//    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd.

    private static void ex2() {
        String trash = "aaaabbbcdd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < trash.length() - 1; i++) {
            if (trash.charAt(i) != trash.charAt(i + 1)) {
                result.append(trash.charAt(i));
                if (count != 1) {
                    result.append(count);
                }
                count = 0;
            }
            count++;
        }
        result.append((trash.charAt(trash.length() - 1))).append(count);
        System.out.println(result);
    }
}