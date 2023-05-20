package lesson5;
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов

import java.util.HashMap;
import java.util.Map;

// Вывести данные по сотрудникам с фамилией Иванов.
public class task00 {
    public static void main(String[] args) {
    ex0();
    }
    private static void ex0() {
        Map<String, String> employesMap = new HashMap<>(20);
        employesMap.put("123456", "Иванов");
        employesMap.put("321456", "Васильев");
        employesMap.put("234561", "Петрова");
        employesMap.put("234432", "Иванов");
        employesMap.put("654321", "Петрова");
        employesMap.put("345678", "Иванов");

//        for (Map.Entry<String,String> entry: employesMap.entrySet()) {
//            System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());
//        }
//        for (String key:employesMap.keySet()) {
//            System.out.printf("%s\t->\t%s%n", key, employesMap.get(key));
//        }
        employesMap.forEach((key, value) -> {
            System.out.printf("%s\t->\t%s%n", key, value);
        });

        Map<Integer, String> testMap = Map.of(
                12, "A",
                13,  "B",
                65, "Y"
        );

        Map<Integer, Integer> testMap2 = Map.ofEntries(
                Map.entry(2324, 234),
                Map.entry(32, 9),
                Map.entry(5455, 44)
        );
    }
}
