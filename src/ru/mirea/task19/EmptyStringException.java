package ru.mirea.task19;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Empty string not allowed");
    }
}
