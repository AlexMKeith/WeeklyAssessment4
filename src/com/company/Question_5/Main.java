package com.company.Question_5;

import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */


    }
    public void newMain() {
        System.out.println("Which direction would you like to go?");
        switch (input.nextLine()) {
            case "Forward":
                System.out.println("You choose to go forward.");
                newMain();
            case "Left":
                System.out.println("You choose to go left.");
                newMain();
            case "Right":
                System.out.println("You choose to go right.");
                newMain();
            case "backwards":
                System.out.println("You choose to go backwards.");
                newMain();
                default:
                    System.out.println("Please pick one of the options.");
                    newMain();
        }
    }

}
