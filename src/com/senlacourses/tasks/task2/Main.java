package com.senlacourses.tasks.task2;

import com.senlacourses.tasks.resources.Calculation;
import com.senlacourses.tasks.resources.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();

        System.out.println("Введите число a ");
        int a = reader.readInt();

        System.out.println("Введите число b ");
        int b = reader.readInt();

        Calculation calc = new Calculation();
        System.out.println(calc.gcd(a, b));
        System.out.println(calc.lcm(a, b));
    }
}
