package ru.mirea.task7.num3;

public class Test {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1,3, 10, 10, 0, 0);
        System.out.println(rectangle.convertToString(12,12));
        rectangle.speedTest();
    }
}
