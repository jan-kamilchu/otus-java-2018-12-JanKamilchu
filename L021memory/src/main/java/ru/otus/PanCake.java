package ru.otus;

public class PanCake implements Cake {
    private int weightP;
    private String nameP;

    public PanCake(int weight, String name){
        this.nameP = name;
        this.weightP = weight;
    }

    public int GetWeight() {
        return this.weightP;
    }

    public String GetName() {
        return this.nameP;
    }
}
