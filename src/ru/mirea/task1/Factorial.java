package ru.mirea.task1;

import java.util.Scanner;

public class Factorial {

   /* Разработайте программу, которая будет с помощью метода вычислять факториал числа (используйте управляющую
   конструкцию цикла), проверьте работу метода.  */

    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int factNumber = scan.nextInt();

        System.out.println("Factorial: " + fact(factNumber));


    }


}
