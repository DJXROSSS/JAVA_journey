package Lecture3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        for (initialization; condition; increment/decrement){
//            body
//        }
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();

//        for (int numberOfLines = 1; numberOfLines <= input; numberOfLines++) {
//            for (int numberOfStars = 1; numberOfStars <= numberOfLines; numberOfStars++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int numberOfLines = 1; numberOfLines <= input; numberOfLines++) {
            System.out.print(" ".repeat((numberOfLines-1)*2));
            System.out.print("*".repeat(input - numberOfLines +1));
            System.out.println();
        }
        for (int numberOfLines = 1; numberOfLines <= input; numberOfLines++) {
            if (numberOfLines == 1 || numberOfLines == input) {
                System.out.println("*".repeat(input));
            } else {
                System.out.println("*"+" ".repeat(input-2)+"*");
            }
        }

    }
}
