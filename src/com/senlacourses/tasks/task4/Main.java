package com.senlacourses.tasks.task4;

import com.senlacourses.tasks.resources.SearchString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String input = sc.nextLine();

        System.out.println("Введите слово для поиска: ");

        String searchString = sc.nextLine();

        String clearText = input.replaceAll("\\p{Punct}", " ");

        SearchString search = new SearchString();
        search.searchStringCount(clearText, searchString);
    }
}
