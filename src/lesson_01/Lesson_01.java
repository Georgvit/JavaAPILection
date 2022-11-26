package lesson_01;

import java.util.*;

public class Lesson_01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(100);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }

        System.out.println(Arrays.toString(arr));

        String str = "Hello Georg";
        StringBuilder sbstr = new StringBuilder(str).reverse();
        System.out.println(str);
        System.out.println(sbstr);
        System.out.println(Character.toString(sbstr.toString().getBytes()[4]));

    }
}
