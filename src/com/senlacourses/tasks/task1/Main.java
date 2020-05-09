package com.senlacourses.tasks.task1;

import com.senlacourses.tasks.resources.CheckEvenClass;
import com.senlacourses.tasks.resources.NaturalNumbersCheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        try {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            CheckEvenClass CheckEven = new CheckEvenClass();
            CheckEven.CheckEven(num);
            NaturalNumbersCheck NaturalNumbers = new NaturalNumbersCheck();
            NaturalNumbers.checkIsItANaturalNumber(num);
        } catch (Exception e) {
            System.out.println("Некорректный ввод " + e);
        }
    }
}







