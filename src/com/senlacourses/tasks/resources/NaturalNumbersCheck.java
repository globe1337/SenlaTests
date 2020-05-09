package com.senlacourses.tasks.resources;

public class NaturalNumbersCheck {

    public void checkIsItANaturalNumber(int num) {
        boolean isComposite = false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite)
            System.out.println("Число " + num + " составное ");
        else
            System.out.println("Число " + num + " простое ");
    }
}
