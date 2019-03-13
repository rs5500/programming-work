package com.company;

/**
 * Created by rs5500 on 3/13/2019.
 */
public class Dog {
    private String species;
    private String name;
    private boolean dockedTail;
    public Dog(String Name, boolean Tail){
        species = "Dog";
        name = Name;
        dockedTail = Tail;
    }
    public void MakeSound(){
        System.out.println("Woof");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void PlayFetch(){
        System.out.println("*chases ball 5 times then quits*");
    }
    public boolean getDockedTail(){
        return(dockedTail);
    }
}
