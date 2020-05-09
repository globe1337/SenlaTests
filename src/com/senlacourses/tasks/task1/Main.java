package com.senlacourses.tasks.task1;
import com.senlacourses.tasks.resources.CheckEven;
import com.senlacourses.tasks.resources.NaturalNumbersCheck;
import com.senlacourses.tasks.resources.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int num = reader.readInt();

        CheckEven checkEven = new CheckEven();
        checkEven.checkEven(num);

        NaturalNumbersCheck naturalNumbers = new NaturalNumbersCheck();
        naturalNumbers.checkIsItANaturalNumber(num);
    }
}







