package ru.otus;

import java.util.Random;

public class SweetCake implements Cake {
    private int weightP;
    private String nameP;

    public SweetCake(int weight, String name){
        this.nameP = name;
        this.weightP = weight;
    }

    public SweetCake(){
        this.weightP = new Random().nextInt();
    }
    public int GetWeight() {
        return this.weightP;
    }

    public String GetName() {
        return this.nameP;
    }
}
