package com.senlacourses.tasks.task5;

import com.senlacourses.tasks.resources.Palindrome;
import com.senlacourses.tasks.resources.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.println("Введите длину последовательности чисел от 0 до 100");
        int input = reader.readInt();
        if (input > 0 && input <= 100) {
            for (int i = 0; i <= input; i++) {
                if (Palindrome.palindrome(i)) System.out.println(i);
            }
        } else {
            System.out.println("Введите длину последовательности чисел от 0 до 100");
        }
    }
}
