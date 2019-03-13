package com.company;

/**
 * Created by rs5500 on 3/13/2019.
 */
public class Animal {
    private String species;
    private String name;
    public Animal(String Species, String Name){
        species = Species;
        name = Name;
    }
    public void MakeSound(){
        System.out.println("Grrr");
    }
    public void PrintName(){
        System.out.println(name);
    }
}
