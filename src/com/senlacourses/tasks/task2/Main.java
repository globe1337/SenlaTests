package com.senlacourses.tasks.task2;

import com.senlacourses.tasks.resources.Calculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число a ");
            int a = sc.nextInt();
            System.out.println("Введите число b ");
            int b = sc.nextInt();
            Calculation calc = new Calculation();
            System.out.println(calc.gcd(a, b));
            System.out.println(calc.lcm(a, b));
        } catch (Exception e) {
            System.out.println("Некорректный ввод " + e);
        }

    }


}
