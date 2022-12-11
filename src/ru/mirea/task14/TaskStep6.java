package ru.mirea.task14;

import java.util.regex.Pattern;

public class TaskStep6 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[\\w\\-\\.]+@[\\w\\-\\.]+");
        String[] ss = new String[] {"user@example.com", "root@localhost", "someone.a.b1@edu.mirea.ru", "myhost@@@com.ru", "@my.ru", "Julia String."};
        for (String s : ss) {
            System.out.println(p.matcher(s).matches());
        }
    }
}
