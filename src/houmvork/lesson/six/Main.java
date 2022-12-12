package houmvork.lesson.six;

import java.util.Random;
import java.util.TreeSet;

public class Main {

    // Создаем новое множество
    static ArraySet arrSet = new ArraySet();

    public static void main(String[] args) {

        Random random = new Random();

        // Заполняем рандомными значениями и выводим результат
        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(100);
            arrSet.add(temp);
        }
        System.out.println("Множество Set реализуемое через TreeMap");

        arrSet.printArr();
        System.out.println();

        // Создаем новое множество TreeSet
        TreeSet<Integer> newArrSet = new TreeSet<>(new Sorted());
        // Заполняем рандомными значениями и выводим результат
        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(100);
            newArrSet.add(temp);
        }
        System.out.println("Множество Set реализуемое через TreeSet");

        newArrSet.forEach(s -> System.out.print(s + " "));

    }
}
