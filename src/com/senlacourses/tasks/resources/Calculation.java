package com.senlacourses.tasks.resources;

public class Calculation {
    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
