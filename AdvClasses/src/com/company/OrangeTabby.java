package com.company;

/**
 * Created by rs5500 on 3/13/2019.
 */
public class OrangeTabby {
    private String species;
    private String name;
    public OrangeTabby(String Name){
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
        LayOnLap();
        System.out.println("*takes a nap*");
    }
    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
