package ru.mirea.task3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String name = scan.nextLine();
        System.out.print("Enter book author: ");
        String author = scan.nextLine();
        System.out.print("Enter book age: ");
        int year = scan.nextInt();

        Book newBook = new Book(author,name,year);

        System.out.println("Name book = " + newBook.getName());

        System.out.print("Enter new book name: ");
        String newName = scan.next();

        newBook.setName(newName);
        System.out.println("New book name: " + newBook.getName());




    }
}
