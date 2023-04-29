package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task00 {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        final int size = 100_000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(0, random.nextInt());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arrayList = new ArrayList<>(size);
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(0, random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}
