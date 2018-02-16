package com.company.Question_4;
import java.util.Scanner;

public class Main {

    private Scanner userNumber = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        1. Create a new method to take user input of a number between 1 and 100
        2. Create an if statement that will take this number and if the number is between 1 and/or equal to 45 display,
        "You have been teleported to a swamp".  If the number is between 46 and/or 90 display, "Lucky you, you've been
        teleported to the beach".  If the number is between 91 and/or equal to 100 display, "Well, I hope you like it hot,
        you have been teleported to a volcano."
         */
    }

    public Scanner getInput() {
        return userNumber;
    }

    public void setInput(Scanner input) {
        this.userNumber = input;
    }

    public static void userInput () {

    int userNumber;

    System.out.println("Pick a number between 1 and 100.");

    if (userNumber >= 1 && userNumber <= 45) {
        System.out.println("You have been teleported to a swamp");
    } else if (userNumber >= 46 && userNumber <= 90) {
        System.out.println("Lucky you, you've been\n" +
                " teleported to the beach");
    } else if (userNumber >= 91 && userNumber <= 100) {
        System.out.println("Well, I hope you like it hot,\n" +
                " you have been teleported to a volcano.");
    }

}

}