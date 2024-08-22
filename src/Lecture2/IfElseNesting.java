package Lecture2;

import java.util.Scanner;

public class IfElseNesting {
    public static void main(String[] args) {
        //lets make a program to tell whether the user is eligible to vote or not
        //in order to be eligible to vote he/she has to be over 18 and have an adhar card

        int age = 18;
        boolean hasAdhar = true;
        if (age >= 18) {
            if (hasAdhar == true) {
                System.out.println("Congrats!! You are eligible to vote!");
            } else {
                System.out.println("Sorry you don't have a valid Adhar card.");
            }
        } else {
            System.out.println("Sorry you are not above the age of 18.");
        }
    }

}
