package ru.mirea.task7.num5;

public class Test{
    public static void main(String[] args) {
        System.out.println("Наоборот: "+StringTransformer.reverse("abcdefg"));
        System.out.println("Подсчёт символов: "+StringTransformer.countChars("12345678910"));
        System.out.println("Нечётные: "+StringTransformer.fromOdds("0123456789"));
    }
}