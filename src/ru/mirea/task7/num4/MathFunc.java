package ru.mirea.task7.num4;

import java.util.Scanner;

public class MathFunc implements MathCalc{
    @Override
    public double pow(double n, int pow) {
        double res=1;
        for(int i=0;i<pow;++i)
            res*=n;
        return res;
    }

    @Override
    public double getAbs(double a, double b) {
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        MathCalc mc = new MathFunc();
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Возведение в степень " + mc.pow(2, 3));
        System.out.println("Пифагор: " + mc.getAbs(4, 3));
        System.out.println("\nНахождение длины окружности ");
        System.out.println("Введите радиус: ");
        r = Double.parseDouble(sc.next());
        System.out.println("Длина окружности равна: " + 2*PI*r);
    }
}