package ru.mirea.task22;

public class DoubleParseException extends Exception{
    public DoubleParseException(){
        super("Wrong value! Try another expression");
    }
}
