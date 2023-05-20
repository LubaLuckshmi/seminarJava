package lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*1. Создайте HashSet, заполните его следующими числами:
        {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
  2. Создайте LinkedHashSet, заполните его следующими числами:
   {1, 2, 3, 2, 4, 5, 6, 3}.
   Распечатайте содержимое данного множества.
  3. Создайте TreeSet, заполните его следующими числами:
{1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.


 */
public class task00 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        hashSet.add(0);

        for (Object item: hashSet) {
            System.out.print(item + " ");
        }
        System.out.println();

        LinkedHashSet linkedSet = new LinkedHashSet(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        linkedSet.add(0);


        for (Object item: linkedSet) {
            System.out.print(item + " ");
        }
        System.out.println();

        TreeSet treeSet = new TreeSet(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        treeSet.add(0);
        treeSet.add(6);

        for (Object item: treeSet) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
