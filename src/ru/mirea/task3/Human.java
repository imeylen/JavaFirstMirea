package ru.mirea.task3;

//Создайте класс, описывающий тело человека (Human). Для описания каждой части тела создайте отдельные классы (Head, Leg, Hand).
// Опишите необходимые свойства и методы для каждого класса. Протестируйте работу класса Human.

public class Human {
    String name;
    int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Leg {
            int amount;

            public Leg(int amount) {
                this.amount = amount;
            }
        }

        class Hand {
            int amount;

            public Hand(int amount) {
                this.amount = amount;
            }
        }

        class Head {
            String eyeColor;
            String hairColor;

            public Head(String eyeColor, String hairColor) {
                this.eyeColor = eyeColor;
                this.hairColor = hairColor;
            }
        }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


