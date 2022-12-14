package houmvork.lesson.five;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class ArrayMap {
    public static void main(String[] args) {
        newMap();
        comparingArrays();
    }


    //    Создание и заполнение списков
    public static void newMap() {
        System.out.println("HashMap");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Maria");
        map.put(1, "Maxim");
        map.put(2, "Irina");
        map.putIfAbsent(3, "Alex");
        map.forEach((k, v) -> System.out.println("Key: " + k + " Volume: " + v));
        map.replaceAll((k, v) -> v = v + "!");
        map.forEach((k, v) -> System.out.println("Key: " + k + " Volume: " + v));

        System.out.println("TreeMap");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(0, "Blue");
        treeMap.put(1, "Black");
        treeMap.put(2, "White");
        treeMap.putIfAbsent(3, "Red");
        treeMap.forEach((k, v) -> System.out.println("Key: " + k + " Volume: " + v));
        treeMap.replaceAll((k, v) -> v = v + "!");
        treeMap.forEach((k, v) -> System.out.println("Key: " + k + " Volume: " + v));
    }

    //    Сравнение времени перебора двух типов списков
    private static void comparingArrays() {
        int count = 10001;
        Random random = new Random();
        HashMap<Integer, String> newMap = new HashMap<>();
        for (int i = 0; i < count; i++) {
            int key = random.nextInt(count);
            newMap.put(key, "value");
        }

        TreeMap<Integer, String> newTreeMap = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            int key = random.nextInt(count);
            newTreeMap.put(key, "value");
        }

        float start = System.currentTimeMillis();
        newMap.forEach((k, v) -> System.out.print(k + " " + v));
        float stop = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Время прямого перебора HashMap " + stop + " мс.");


        start = System.currentTimeMillis();
        newTreeMap.forEach((k, v) -> System.out.print(k + " " + v));
        stop = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Время прямого перебора TreeMap " + stop + " мс.");

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int key = random.nextInt(count);
            System.out.print(newMap.get(key));
        }
        stop = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Время рандомного перебора HashMap " + stop + " мс.");


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int key = random.nextInt(count);
            System.out.print(newTreeMap.get(key));
        }
        stop = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Время рандомного перебора TreeMap " + stop + " мс.");

    }


}
