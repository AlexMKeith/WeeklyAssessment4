package com.company.Question_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

   /*
    Alex Keith
     */

    private String input = new String(System.in);
    List<String> answer = Arrays.asList();

    public static void main(String[] args) {
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */


    }

    protected void addToArrayList() {
        answer.add(input);
    }

    protected void displayArray() {
        int position = 1;

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(position + ". " + answer.get(i).input());
            position++;
        }

    }
}
