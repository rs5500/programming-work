package com.company;

/**
 * Created by rs5500 on 3/13/2019.
 */
public class RussianBlue {
    private String species;
    private String name;
    public RussianBlue(String Name){
        species = "Cat";
        name = Name;
    }
    public void MakeSound(){
        System.out.println("Hisss");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("purrrr");
        SeeLaser();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
