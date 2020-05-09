package com.senlacourses.tasks.resources;

public class Palindrome {
    public static boolean palindrome(int i) {
        int converselyNumber = 0;
        int tempNumber = i;
        while (tempNumber != 0) {
            converselyNumber = (converselyNumber * 10) + (tempNumber % 10);
            tempNumber /= 10;
        }
        return i == converselyNumber;
    }
}
