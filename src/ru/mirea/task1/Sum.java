package ru.mirea.task1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        /* Разработайте программу, в результате работы которой считается сумма элементов целочисленного массива
         с помощью циклов for, while, do while, результат выводится на экран. */

        int[] array = new int[5];
        int sum = 0;

        System.out.println("Enter 5 number: ");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
            sum += array[i];
        }
        System.out.println("Sum of array elements (for) : " + sum);

        sum = 0;

        int i = 0;
        while (i < 5) {
            sum += array[i];
            i++;
        }

        System.out.println("Sum of array elements (while) : " + sum);

        sum = 0;
        i = 0;

        do {
            sum += array[i];
            i++;
        }
        while (i < 5);

        System.out.println("Sum of array elements (do while) : " + sum);

        /*Разработайте программу, в результате работы которой выводятся на экран
        первые 10 чисел гармонического ряда (форматируйте вывод).*/


    }

}

