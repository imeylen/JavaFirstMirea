package ru.mirea.task3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter circle radius: ");
        int radius = scan.nextInt();
        Circle newCircle = new Circle(radius);
        System.out.println("Circle radius = " + newCircle.getRadius());

        System.out.printf("Enter new circle radius: ");
        radius = scan.nextInt();
        newCircle.setRadius(radius);
        System.out.println("New circle radius = " + newCircle.getRadius());

    }
}
