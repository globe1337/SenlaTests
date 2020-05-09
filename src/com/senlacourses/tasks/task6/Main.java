package com.senlacourses.tasks.task6;

import com.senlacourses.tasks.resources.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Thing> things = new ArrayList<>();
        Reader reader = new Reader();
        Random random = new Random();

        System.out.println("Введите количество вещей");
        int numberThings = reader.readInt();

        System.out.println("Введите грузоподъемность рюкзака");
        BackPack backpack = new BackPack(reader.readInt());

        for (int i = 0; i < numberThings; i++) {
            Thing thing = new Thing(random.nextInt(15) + 1, random.nextInt(20) + 1);
            things.add(thing);
        }

        things.sort((first, second) -> Float.compare(second.getRatio(), first.getRatio()));

        System.out.println("################## Общий список #######################");
        for (Thing thing : things) {
            System.out.print(thing.toString());
            backpack.addItem(thing);
        }
        System.out.println("#######################################################");
        System.out.println();
        backpack.showBackpack();
    }
}

