package ru.otus;

public class PanCakeFactory extends CakeFactory {
    @Override
    public PanCake cookTheCake(int weight, String name) {
        return new PanCake(weight,name);
    }
}
