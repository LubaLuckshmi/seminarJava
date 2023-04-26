package lesson3;

import java.util.*;

/* заполнить список 10 случайными числами
отсортировать список методом sort и вывести его на экран
 */
public class task01 {
    public static void main(String[] args) {
        ex1();

    }

    private static void ex1() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        list.sort(Comparator.naturalOrder());
//      Collections.sort(list, Comparator.naturalOrder());  /*comporator можно и не добавлять в этом случае*/
//      Collections.sort(list, Comparator.reverseOrder()); обратная сортировка
        System.out.println(list);
    }
}
