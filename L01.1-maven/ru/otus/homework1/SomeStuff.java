package ru.otus.homework1;

import static com.google.common.base.Objects.equal;

public class SomeStuff {
    String MyStr;

    public SomeStuff(String str){
        this.MyStr = str;
    }
    public String DoSomeStuff(){
        String s1 = "str1";

        if (equal(s1, MyStr)){
            return "same string";
        }else{
            return "dif string";
        }
    }
}
