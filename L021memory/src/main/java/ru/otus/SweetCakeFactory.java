package ru.otus;

public class SweetCakeFactory extends CakeFactory {
    @Override
    public SweetCake cookTheCake(int weight, String name) {
        return new SweetCake(weight,name);
    }
}
