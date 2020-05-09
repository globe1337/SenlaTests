package com.senlacourses.tasks.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите предложение :");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int count = 0;
        ArrayList<String> words = new ArrayList<>();

        String clearSigns = line.replaceAll("\\p{Punct}", " ");

        for (String word : clearSigns.split(" ")) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            words.add(word);
            count++;
        }

        Collections.sort(words);
        for (String word : words) System.out.println(word);
        System.out.println("Количество слов: " + count);


    }
}
