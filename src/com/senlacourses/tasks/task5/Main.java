package com.senlacourses.tasks.task5;

import com.senlacourses.tasks.resources.Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину последовательности чисел от 0 до 100");
        int input  = sc.nextInt();
        if (input  > 0 || input  <= 100) {
            for (int i = 0; i <= input ; i++) {
                if (Palindrome.palindrome(i)) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Введите длину последовательности чисел от 0 до 100");
        }
    }
}
