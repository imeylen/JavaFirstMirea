package ru.mirea.task11.part2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TimeCode timeCode = new TimeCode();
        timeCode.timeAdd("!");
        System.out.println();
        timeCode.timeFind("!");
        System.out.println();
        timeCode.timeInsert(2, "bad");
        System.out.println();
        timeCode.timeDelete("!");

    }
}