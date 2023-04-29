package lesson4;

import java.util.*;


/*
Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в
        связный список на позицию num.
        Если введено print~num, выводит строку из позиции num
        в связном списке и удаляет её из списка.
        4. Продумать систему добавления элементов на индексы, превышающие размер
Добавить проверки ввода
*/
public class task01 {
    public static void main(String[] args) {
        //  ex1();
        ex2();
    }

    private static void ex2() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");


        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.trim().length() == 0) {
//            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equalsIgnoreCase("каша не вари")) {
                break;
            }
            if (inputString.equalsIgnoreCase("print~all")) {
                printAllNotNullValues(wordsList);
                continue;
            }
            if (!inputString.contains("~")) {
                System.out.println("Строка не содержит тильду");
                continue;
            }

            String[] parts = inputString.split("\\~+");

            if (parts.length != 2) {
                System.out.println("Ошибка ввода шаблона. Должно быть \"word~num\". Пример: apple~6");
                continue;
            }

            String word = parts[0];
            int num = 0;

            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }

            if (num < 1) {
                System.out.println("Введите num более 1");
                continue;
            }

            if (word.equalsIgnoreCase("print")) {
                if (!isNumberInRange(num, wordsList.size()) || valueIsNull(wordsList, num)) {
                    System.out.println("Указанного значения не существует");
                } else {
                    System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                    wordsList.remove(num - 1);
                }
            } else if (isNumberInRange(num, wordsList.size())) {
                String oldWord = wordsList.get(num - 1);

                if (valueIsNull(wordsList, num)) {
                    printAddMessage(word, num);
                } else {
                    printSetMessage(word, num, oldWord);
                }
                wordsList.set(num - 1, word);
            } else {
                int nullCount = num - wordsList.size() - 1;
                addNulls(wordsList, nullCount);
                wordsList.add(word);
                printAddMessage(word, num);
            }
        }
    }


    private static void addNulls(LinkedList<String> wordsList, int count) {
        for (int i = 0; i < count; i++) {
            wordsList.add(null);
        }
    }

    private static void printAllNotNullValues(LinkedList<String> wordsList) {
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i) != null) {
                System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
            }
        }
    }

    private static void printSetMessage(String word, int num, String oldWord) {
        System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
    }

    private static void printAddMessage(String word, int num) {
        System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
    }

    private static boolean valueIsNull(LinkedList<String> wordsList, int num) {
        return wordsList.get(num - 1) == null;
    }

    private static boolean isNumberInRange(int num, int size) {
        return num >= 1 & num <= size;
    }




    private static void ex1() {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<>();
        //#6 - filter input
        //SSSS~NNN - true
        //SSS#~NNN - true
        //NNN~NNN - true
        //SSSS~SSS - fase
        //SSS~~NNN
        //^[A-Z]{.}~\d{.} - true$
//        String regex = "^(?i)[A-Z]{3,}~\\d{3,} - true$";
//        boolean matches = Pattern.matches(regex, tmpValue);
//        System.out.println(matches);
        boolean isNotCorrect = true;
        String tmpValue;
        int index = 0;
        int tildaPosition = 0;
        do {
            System.out.print(">_");
            tmpValue = scanner.nextLine();
            if (tmpValue.equals("stop")) {
                break;
            }
            tildaPosition = tmpValue.indexOf('~');
            //check input
            try {
                index = Integer.parseInt(tmpValue.substring(tildaPosition + 1));
            } catch (NumberFormatException e) {
                System.out.println("Wrong input: " + " position: " + e.getMessage());
                isNotCorrect = true;
            }
            //Если введено print~num, выводит строку из позиции num в связном списке
            // и удаляет её из списка
            //print~num

            if ("print".equals(tmpValue.substring(0,tildaPosition))) {
                printAndRemove(linkedList,index);
            } else {
                if (index > linkedList.size()) {
                    insertNulls(linkedList, index);
                }
                linkedList.add(index, tmpValue.substring(0, tildaPosition));
            }
        } while (isNotCorrect);

        printLinkedList(linkedList);
    }

    private static void printAndRemove(LinkedList<String> linkedList, int index) {
        if (index < linkedList.size()){
            System.out.printf("[%n]%s",index,linkedList.get(index));
            linkedList.remove(index);
        }
    }

    private static void insertNulls(LinkedList<String> linkedList, int index) {
        for (int i = linkedList.size(); i < index; i++) {
            linkedList.add(i,null);
        }
    }

    private static void printLinkedList(LinkedList<String> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.printf("[%d]:%s%n",i,linkedList.get(i));

        }
    }
}