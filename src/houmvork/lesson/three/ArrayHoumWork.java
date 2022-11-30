package houmvork.lesson.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
/*  1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
    2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    3. Вставить элемент в список в первой позиции.
    4. Извлечь элемент (по указанному индексу) из заданного списка.
    5. Обновить определенный элемент списка по заданному индексу.
    6. Удалить третий элемент из списка.
    7. Поиска элемента в списке по строке.
    8. Создать новый список и добавить в него несколько елементов первого списка.
    9. Удалить из первого списка все элементы отсутствующие во втором списке.
    10. *Сортировка списка.
    11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.*/


public class ArrayHoumWork {
    public static void main(String[] args) {

//        Создаем листы для выполнения операций
        ArrayList<String> arrString = new ArrayList<>();
        ArrayList<String> arrStringTwo = new ArrayList<>();
//        Вывод обработанных данных
        System.out.println("Новый список: ");
        arrMetod(arrString);
        System.out.println();
        System.out.println("Список с добавлением '!' к каждому элементу: ");
        iterationArray(arrString);
        System.out.println();
        System.out.println("Список с добавлением нового элемента на 1ю позицию: ");
        addPositionArray(arrString);
        System.out.println();
        indexElementArray(arrString);
        System.out.println("Новый список два: ");
        arrMetod2(arrStringTwo);
        System.out.println();
        System.out.println("Результат удаления из первого списка всех элементов" +
                " отсутствующих во втором списке: ");
        deletElements(arrString, arrStringTwo);
        System.out.println();
        System.out.println("Отсортированый список: ");
        sortElements(arrString);
        System.out.println();
        speedMethod(arrString);
    }

    //    Метод заполнения листов
    public static void arrMetod(ArrayList<String> arrStrin) {
        arrStrin.add("Синий");
        arrStrin.add("Зеленый");
        arrStrin.add("Черный");
        arrStrin.add("Белый");
        arrStrin.add("Красный");
        arrStrin.add("Желтый");
        arrStrin.add("Серый");
        for (String i : arrStrin) {
            System.out.print(i + " ");
        }
    }

    //    Метод добавления символа к каждому элементу коллекции
    public static void iterationArray(ArrayList<String> arrStrin) {
        for (int i = 0; i < arrStrin.size(); i++) {
            String temp = arrStrin.get(i) + "!";
            arrStrin.set(i, temp);
        }
        for (String i : arrStrin) {
            System.out.print(i + " ");
        }
    }

    //    Метод добавления нового элемента в коллекцию
    public static void addPositionArray(ArrayList<String> arrStrin) {
        String newElement = "Розовый!";
        arrStrin.add(0, newElement);
        for (String i : arrStrin) {
            System.out.print(i + " ");
        }
    }

    //    Метод замены элемента в коллекции и получение индекса
    public static void indexElementArray(ArrayList<String> arrStrin) {
        System.out.println("Элемент с индексом 3: " + arrStrin.get(3));
        arrStrin.set(2, "Пурпурный!");
        System.out.println("Измененный элемент на позиции с индексом 2: " + arrStrin.get(2));
        arrStrin.remove(3);
        System.out.println("Список после удаления элемента с индексом 3: ");
        arrStrin.forEach((String s) -> System.out.print(s + " "));
        System.out.println();
        System.out.println("Индекс элемента 'Белый' в списке: " + arrStrin.indexOf("Белый!"));
    }

    //    Метод заполнение массива (заполняем второй лист)
    public static void arrMetod2(ArrayList<String> arrStrin) {
        arrStrin.add("Синий!");
        arrStrin.add("Зеленый!");
        arrStrin.add("Черный!");
        arrStrin.add("Белый!");
        arrStrin.add("Красный!");
        for (String i : arrStrin) {
            System.out.print(i + " ");
        }
    }

    //    Метод сравнение одного литса относительно второго и удаление элементов
    public static void deletElements(ArrayList<String> arrStrin, ArrayList<String> arrStrinTwo) {
        arrStrin.retainAll(arrStrinTwo);
        arrStrin.forEach((String s) -> System.out.print(s + " "));
    }

    //    Метод сортировки элементов в листе
    public static void sortElements(ArrayList<String> arrStrin) {
        Collections.sort(arrStrin);
        arrStrin.forEach((String s) -> System.out.print(s + " "));
    }

    //    Метод сравнение скорости работы методов в ArrayList и LinkedList
    public static void speedMethod(ArrayList<String> arrStrin) {
        LinkedList<String> linList = new LinkedList<>(arrStrin);
        long start = System.currentTimeMillis();
        int count = 10000;
        for (int i = 0; i < count; i++) {
            arrStrin.add(0, arrStrin.get(1));
        }
        long finalTime = System.currentTimeMillis() - start;
        System.out.println("Время повторения операции " +
                "\nдобавления элемента на первую позицию 10000 раз для ArrayList: " + finalTime + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linList.add(0, linList.get(1));
        }
        finalTime = System.currentTimeMillis() - start;
        System.out.println("Время повторения операции " +
                "\nдобавления элемента на первую позицию 10000 раз для LinkedList: " + finalTime + " мс");
    }
}
