package com.company;

/**
 * Created by rs5500 on 3/5/2019.
 */
public class Animal {
    private String species;
    private String name;
    private String color;
    private int age = 0;
    public Animal(String Species,String Name,String Color){
        species = Species;
        name = Name;
        color = Color;
    }
    public void MakeSound(){
        System.out.println("Grrrrr");
    }
    public void SetAge(int newAge){
        age = newAge;
    }
    public void PrintDescription(){
        System.out.println(name +" is a "+age+" year old, "+color+" "+species);
    }
}
