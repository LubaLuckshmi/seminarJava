package lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*Заполнить список названиями планет Солнечной системы в произвольном
порядке с повторениями.
  Вывести название каждой планеты и количество его повторений в списке.
*/
public class task2_1 {
    public static void main(String[] args) {
        ex21();
//        ex22();
//        ex23();
    }


    private static void ex21() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);

        }
        System.out.println(randomSolarSystem);
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);

        int count = 1;
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < randomSolarSystem.size() - 1; i++) {
            if (randomSolarSystem.get(i) != randomSolarSystem.get(i+1)) {
                list.append(randomSolarSystem.get(i)).append(":").append(count).append("\n");
                count = 0;
            }
            count++;
        }
        list.append(randomSolarSystem.get(randomSolarSystem.size() - 1)).append(":").append(count).append("\n");
        System.out.println(list);
    }


    private static void ex22() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
           int count = 0;
            for (var item :
                    randomSolarSystem) {

                if (item.equals(planetsNamesStringArray[i]))
                    count++;
            }
            sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");

        }
        System.out.println(sb);
    }
    private static void ex23() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();

        int venus = list.indexOf("Venus");
        System.out.println(venus);
        int uranus = list.indexOf("Uranus");
        System.out.println(uranus);
        int mercury = list.indexOf("Mercury");
        System.out.println(mercury);

    }
}
