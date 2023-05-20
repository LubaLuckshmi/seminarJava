package lesson6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(2,"Vasya", "persian",true);

        Cat cat1 = new Cat(5, "Masha", "persian", false);

        Cat cat2 = new Cat(5, "Masha", "persian", false);

        VetCat catVet = new VetCat(4,"Viktor", "persian",true, "blanc", false);

        TheatreCat theatreCat = new TheatreCat(1,"Oleg", "persian",true, 012, "jump");



        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(catVet);
        cats.add(theatreCat);

        System.out.println(cats);
    }
}
