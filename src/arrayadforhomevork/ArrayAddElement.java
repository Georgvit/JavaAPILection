package arrayadforhomevork;

import java.util.Arrays;

public class ArrayAddElement {
    public static void main(String[] args) {
        int[] arr = new int[16];
        int numbers = 0;
        int n = 0;
        int finalNumber = 65;
        while (n < finalNumber) {

            for (int i = n; i < arr.length; i++) {
                if ((i >= arr.length - 1) & (arr.length < finalNumber)) {
                    int[] temp = new int[arr.length + 1];
                    for (int j = 0; j < arr.length; j++) {
                        temp[j] = arr[j];
                    }
                    arr = temp;
                    //System.out.println("temp step " + i + Arrays.toString(temp));
                    break;
                }

                arr[i] = numbers;
                //System.out.println("arr step " + i + Arrays.toString(arr));
            }
            numbers++;
            n++;
        }
        System.out.println("Final array " + Arrays.toString(arr));

    }
}
