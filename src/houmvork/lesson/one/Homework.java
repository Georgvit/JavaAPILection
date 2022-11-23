package houmvork.lesson.one;

import java.util.Arrays;
import java.util.Random;


public class Homework {
    public static void main(String[] args) {

        //        Генерация случайного числа и вывод результата
        int randomNumb = randonNumber();
        System.out.println("Случайное число в диапазоне от -1000 до 1000: " + randomNumb);

        //        Получение старшего бита и вывод результата
        int numberBit = mostSignificantBit(randomNumb);
        System.out.println("Номер старшего значащего бита выпавшего числа: " + numberBit);

        //        Получение массива чисел кратных numberBit
        int[] arrayMultipleNumber = multipleNumber(numberBit, randomNumb);
        System.out.println("Массив кратных номеру старшего бита чисел: " + Arrays.toString(arrayMultipleNumber));

        //        Получение массива чисел не кратных numberBit
        int[] arrayNotMultipleNumber = notMultipleNumber(numberBit, randomNumb);
        System.out.println("Массив некратных номеру старшего бита чисел: " + Arrays.toString(arrayNotMultipleNumber));

    }

    //Создаем метод генерации случайного числа
    static int randonNumber() {
        int minRange = -1000;
        int maxRange = 2000;
        int randomNum = minRange + new Random().nextInt(maxRange);
        return randomNum;
    }

    //Метод подсчета старшего значащего бита
    static int mostSignificantBit(int num) {
        if (num < 0) {
            num = -num;
        }
        int count = 0;
        while (num != 1) {
            num >>= 1;
            count++;
        }
        return count;
    }

    //    Определим длину буующего массива
    static int LengthArray(int minOMmax, int randNUm, int numBit) {
        int lengthArray = 0;
        if (minOMmax == 1) {
            while (randNUm != Short.MAX_VALUE) {
                if (randNUm % numBit == 0) {
                    lengthArray++;
                }
                randNUm++;

            }

        } else if (minOMmax == 0) {
            int newRandNum;
            while (randNUm != Short.MIN_VALUE) {
                if (randNUm < 0) {
                    newRandNum = -randNUm;
                } else {
                    newRandNum = randNUm;
                }
                if (newRandNum % numBit == 1) {
                    lengthArray++;
                }
                randNUm--;

            }
        }
        return lengthArray;

    }

    //Метод поиска чисел кратных numberBit
    static int[] multipleNumber(int numBit, int randNUm) {
        int countIndex = 0;
        int minOMmax = 1;
        int[] arrayOne = new int[LengthArray(minOMmax, randNUm, numBit)];
        while (randNUm != Short.MAX_VALUE) {
            if (randNUm % numBit == 0) {
                arrayOne[countIndex] = randNUm;
                countIndex++;
            }
            randNUm++;

        }
        return arrayOne;

    }

    //Метод поиска чисел не кратных numberBit
    static int[] notMultipleNumber(int numBit, int randNUm) {
        int cou = 0;
        int minOMmax = 0;
        int[] arrayTwo = new int[LengthArray(minOMmax, randNUm, numBit)];
        int newRandNum;
        while (randNUm != Short.MIN_VALUE) {
            if (randNUm < 0) {
                newRandNum = -randNUm;
            } else {
                newRandNum = randNUm;
            }
            if (newRandNum % numBit == 1) {
                arrayTwo[cou] = randNUm;
                cou++;

            }
            randNUm--;

        }
        return arrayTwo;
    }


}
