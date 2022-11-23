package Lection_01;/*Задана натуральная степень k.
        Сформировать случайным образом список коэффициентов
        (значения от 0 до 100) многочлена и записать в файл многочлен степени k.
        Пример:
        - k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Введите натуральную степень многочленв: ");
        int degreeK = inputUser.nextInt();
//        System.out.println(ration());


    }

//    Функция получения рандомного коэффициента
    public static int ration(){
        int ration_n = (int) (Math.random() * 100);
        return ration_n;
    }
}