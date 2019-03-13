package com.company;

/**
 * Created by rs5500 on 3/13/2019.
 */
public class Garfield {
    private String species;
    private String name;
    public Garfield(){
        species = "Cat";
        name = "Garfield";
    }
    public void MakeSound(){
        System.out.println("mmmm,  lasagna");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        LayOnLap();
        System.out.println("*takes a nap*");
    }
    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser(){
        BeHappy();
    }
}
