package ru.mirea.task1;

import java.text.DecimalFormat;
/* Разработайте программу, в результате работы которой выводятся на экран первые
 10 чисел гармонического ряда (форматируйте вывод). */

public class Harmonic {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("0.00");
        for(int i = 1; i < 11; i++) {
            double number =  1. / i;
            System.out.println(dF.format(number));
        }
    }
}
