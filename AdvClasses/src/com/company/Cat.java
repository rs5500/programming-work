package com.company;

/**
 * Created by rs5500 on 3/13/2019.
 */
public class Cat {
    private String species;
    private String name;
    public Cat(String Name){
        species = "Cat";
        name = Name;
    }
    public void MakeSound(){
        System.out.println("Meow");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("purrrr");
        SeeLaser();
        MakeSound();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
