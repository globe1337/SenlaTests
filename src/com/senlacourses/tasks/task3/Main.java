package com.senlacourses.tasks.task3;

import com.senlacourses.tasks.resources.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        System.out.println("Введите предложение :");
        String line = reader.readString();

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
