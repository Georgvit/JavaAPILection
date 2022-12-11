package houmvork.lesson.six;

import java.util.Random;

public class Main {

//    Создаем новое множество
    static  ArraySet arrSet = new ArraySet();
    public static void main(String[] args) {

        Random random = new Random();

//        Заполняем рандомными значениями и выводим результат
        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(100);
            arrSet.add(temp);
        }
        System.out.println("Множество Set реализуемое через TreeMap");

        arrSet.printArr();


    }
}
