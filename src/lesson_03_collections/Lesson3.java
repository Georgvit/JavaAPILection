package lesson_03_collections;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class Lesson3 {
    int i = 7;

    public static void main(String[] args) {
//        int[] aI = new int[10];
//        aI[0] = 4;
//        aI[1] = 5;

        ArrayList<Integer> array1 = new ArrayList<>();
//        array1.add(12);
//        array1.add(8, 13);
//        array1.add(30, 32);
//
//        int temp = array1.get(4);
//
//        array1.set(1, 55);
//
//        array1.remove(8);
//        array1.remove(new Integer(7));
//
//        array1.clear();

        for (int i = 0; i < 10; i++) {
            array1.add(new Random().nextInt(50));
        }

//
//        for (Integer i: array1
//             ) {
//            System.out.print(i + " ");
//        }
//        array1.add(1);
//        array1.add(1.5f);
//        array1.add("One");
        System.out.println();

//        Iterator<Integer> iterator = array1.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            i = new Random().nextInt(10);
//            System.out.print(i + " ");
//        }


//        if(array1.get(0) instanceof String){
//
//        }
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            array2.add(j);
        }
//        for (Integer i: array2
//             ) {
//            i = 45;
////            System.out.print(i + " ");
//
//        }
        System.out.println("ar2------------------------");
        array2.forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("ar1----------------------------------");
        array1.forEach(i -> System.out.print(i + " "));

        array2.removeAll(array1);
        System.out.println();
        System.out.println("new ar2----------------------------------");
        array2.forEach(i -> System.out.print(i + " ") );
        System.out.println();
        System.out.println("ar1 ----------------------------------");
        array1.forEach(i -> System.out.print(i + " ") );


        array1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer ar) {
                return integer - ar;
            }
        });

        System.out.println();
        System.out.println("ar1 sort----------------------------------");
        array1.forEach(n -> System.out.print(n + " ") );

        array1.isEmpty();
//        List l1 = array1.subList(2, array1.size()-2);

        array1.trimToSize();
        array1.indexOf(7);

        LinkedList<String> strings = new LinkedList<>();
        //strings.get(5);

        System.out.println(Collections.nCopies(6, new String("Hello")));





    }
}
