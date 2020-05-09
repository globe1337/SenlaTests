package com.senlacourses.tasks.task4;

import com.senlacourses.tasks.resources.Reader;
import com.senlacourses.tasks.resources.SearchString;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

        System.out.println("Введите текст: ");
        String input = reader.readString();

        System.out.println("Введите слово для поиска: ");

        String searchString = reader.readString();

        String clearText = input.replaceAll("\\p{Punct}", " ");

        SearchString search = new SearchString();
        search.searchStringCount(clearText, searchString);
    }
}
