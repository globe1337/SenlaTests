package com.senlacourses.tasks.resources;

public class CheckEvenClass {
    public void CheckEven(int num) {
        if (num % 2 == 0)
            System.out.println("Число " + num + " четное");
        else
            System.out.println("Число " + num + " нечетное");
    }
}

