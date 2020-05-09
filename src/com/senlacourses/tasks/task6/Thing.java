package com.senlacourses.tasks.task6;

public class Thing {

    private final int weight;
    private final int cost;
    private final float ratio;

    public Thing(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
        this.ratio = (float) cost / (float) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {

        return ("Вес: " + weight + "\t Стоимость: " + cost);
    }

    public float getRatio() {
        return ratio;
    }
}
