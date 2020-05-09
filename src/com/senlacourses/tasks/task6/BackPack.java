package com.senlacourses.tasks.task6;

import java.util.ArrayList;
import java.util.List;

public class BackPack {
    private int maxWeight;
    private int weightBackpack;
    private int costBackpack;
    private List<Thing> thingsBackpack = new ArrayList<>();

    public BackPack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int addItem(Thing thing) {
        if (thing.getWeight() <= (maxWeight - weightBackpack)) {
            thingsBackpack.add(thing);
            costBackpack += thing.getCost();
            weightBackpack += thing.getWeight();
            System.out.println("\t Добавлено!");
            return maxWeight - weightBackpack;
        } else {
            System.out.println("\t Предмет не влазит в рюкзак");
        }
        return maxWeight - weightBackpack;
    }

    public void showBackpack() {
        System.out.println("########### Содержимое рюкзака #########");
        System.out.println("Стоимость предметов в рюкзаке: " + costBackpack);
        System.out.println("Общий вес предметов в рюкзаке: " + weightBackpack);
        System.out.println("Вещи в рюкзаке:");

        for (Thing thing : thingsBackpack) {
            System.out.println(thing);
        }
        System.out.println("########################################");
    }
}
