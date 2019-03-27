package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();
        while (true){
            System.out.println("Would you like to (create account) or (login)?");
            String userWill = console.nextLine();
            if (userWill.equals("create account")){
                System.out.println("Enter Username:");
                String user = console.nextLine();
                //COME BACK TO HERE.
                System.out.println("Enter Password:");
                String pass = console.nextLine();
                //COME BACK
                username.add(user);
                password.add(pass);
            } else if(userWill.equals("login")){
                System.out.println("Enter Username:");
                String user = console.nextLine();
                //COME BACK TO HERE.
                System.out.println("Enter Password:");
                String pass = console.nextLine();
                //COME BACK
                while(true)
            }
        }
    }
}
