package ru.otus;

public class MemMain {
    public static void main(String[] args)throws InterruptedException{

        MemoryMeter mm = new MemoryMeter(20000000);
        SweetCakeFactory scf = new SweetCakeFactory();
        PanCakeFactory pcf = new PanCakeFactory();

        mm.MeasureMemory(scf);
        mm.MeasureMemory(pcf);
    }

}
