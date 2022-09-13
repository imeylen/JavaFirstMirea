package ru.mirea.task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingArray {
    /*Разработайте программу, в результате работы которой генерируется массив целых чисел случайным образом,
    выведите его на экран, отсортируйте, и снова выведите на экран (используйте два подхода к генерации
    случайных чисел – метод random() класса Math и класс Random).*/

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }

        System.out.print("Before sorting (Math): ");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.printf("%d ", randomArray[i]);
        }
        System.out.print("\nAfter sorting (Math): ");
        Arrays.sort(randomArray);

        for (int i = 0; i < randomArray.length; i++) {
            System.out.printf("%d ", randomArray[i]);
        }

        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }

        System.out.print("\n\nBefore sorting (Random): ");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.printf("%d ", randomArray[i]);
        }

        System.out.print("\nAfter sorting (Random): ");
        Arrays.sort(randomArray);

        for (int i = 0; i < randomArray.length; i++) {
            System.out.printf("%d ", randomArray[i]);
        }
    }
}

