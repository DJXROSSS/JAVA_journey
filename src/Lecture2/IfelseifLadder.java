package Lecture2;

import java.util.Scanner;
public class IfelseifLadder {
    public static void main(String[] args) {
        //we are going to make the same program that we made using the nested if else here
        // the reason why we prefer this is because it allows us to process only one condition at a time
        //which makes the code easier to understand

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Age: ");
        int age = scan.nextInt();
        System.out.println("Please tell if you have an adhar card or not [Y/N]");
        scan.nextLine();
        String hasAdhar = scan.nextLine();

//        if (age > 18) {
//            System.out.println("18+");
//        } else if (age == 18) {
//            System.out.println("18");
//        } else if (age < 18){
//            System.out.println("18-");
//        } else {
//            System.out.println("bugged");
//        }

        // this example uses conditional and operational logic to reduce the nesting
        if (age >= 18 && (hasAdhar.equalsIgnoreCase("y"))){
            System.out.println("Congrats you are eligible to vote!");
        } else {
            System.out.println("Sorry you are not allowed to vote");
        }

        //this is just make an example of ladder
        if (age >= 18 && hasAdhar.equalsIgnoreCase("y")) {
            System.out.println("eligible");
        } else if (age >= 18 && hasAdhar.equalsIgnoreCase("n")) {
            System.out.println("you do not have a valid adhar card");
        } else if (age < 18 && hasAdhar.equalsIgnoreCase("y")) {
            System.out.println("you are not above the age of 18");
        } else {
            System.out.println("you do not have an adhra card and you are also not above 18");
        }
    }
}
