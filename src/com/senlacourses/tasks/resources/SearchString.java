package com.senlacourses.tasks.resources;

public class SearchString {
    public void searchStringCount(String text, String word) {
        int count = 0;

        for (String str : text.split(" ")) {
            if (str.toLowerCase().equals(word.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Заданное слово встречается " + count + " раз(а)");
    }
}
