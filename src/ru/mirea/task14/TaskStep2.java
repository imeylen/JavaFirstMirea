package ru.mirea.task14;

import java.util.regex.Pattern;

public class TaskStep2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        System.out.println(p.matcher("abcdefghijklmnopqrstuv18340").matches());
        System.out.println(p.matcher("abcdefghijklmnoasdfasdpqrstuv18340").matches());
    }
}
