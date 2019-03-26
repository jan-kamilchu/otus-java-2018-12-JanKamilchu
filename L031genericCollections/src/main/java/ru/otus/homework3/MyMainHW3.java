package ru.otus.homework3;

import java.util.Collections;

public class MyMainHW3 {
    public static void main(String[] args){
        //MyOwnArrayList<Integer> a = new MyOwnArrayList();
        MyOwnArrayList<String> a = new MyOwnArrayList();

        System.out.println("Check ADD");
        for(int i=0;i<15;i++){
            //a.add(i);//пример работы с числами
            a.add("q"+i);//и со строками
            System.out.println(a.get(i));
        }

        System.out.println("Check Collections.addAll");
        boolean boo = Collections.addAll(a,"w1","w2","w3");
        for(int i=a.size()-4;i<a.size();i++) System.out.println(a.get(i));

        MyOwnArrayList<String> b = new MyOwnArrayList(20);
        for(int i=0;i<20;i++) b.add("s"+i);

        Collections.copy(b, a);
        System.out.println("Copy check");
        for(int i=0;i<b.size();i++) {
            System.out.println(b.get(i));
        }

    }
}
