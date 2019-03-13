package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal A = new Animal("gorilla","Sam");
	    Dog D = new Dog("max",true);
	    Cat C = new Cat("Chris");
	    OrangeTabby O = new OrangeTabby("Jill");
	    RussianBlue R = new RussianBlue("Leon");
	    Garfield G = new Garfield();
	    A.MakeSound();
	    A.PrintName();
	    D.MakeSound();
	    D.PrintName();
	    D.PlayFetch();
	    D.getDockedTail();
	    C.MakeSound();
	    C.PrintName();
	    C.BeHappy();
	    C.SeeLaser();
	    O.MakeSound();
	    O.PrintName();
	    O.BeHappy();
	    O.LayOnLap();
	    O.SeeLaser();
	    R.MakeSound();
	    R.PrintName();
	    R.BeHappy();
	    R.SeeLaser();
	    G.MakeSound();
	    G.PrintName();
	    G.BeHappy();
	    G.LayOnLap();
	    G.SeeLaser();
    }
}
