package Lecture3;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = scanner.nextInt();

        // Top half of the pattern
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(" ".repeat(n) + " ".repeat(n - i) + "#");
            } else {
                System.out.println(" ".repeat(n) + " ".repeat(n - i) + "#" + " ".repeat(2 * i - 3) + "#");
            }
        }

        // Middle and lower half of the pattern
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(" ".repeat(n - i) + "#" + " ".repeat(2 * n - 1) + "#");
            } else {
                System.out.println(" ".repeat(n - i) + "#" + " ".repeat(2 * i - 3) + "#" + " ".repeat(2 * (n - i) + 1) + "#" + " ".repeat(2 * i - 3) + "#");
            }
        }

        // Lower part of the pattern (reverse of the upper half)
        for (int i = n - 1; i > 0; i--) {
            if (i == 1) {
                System.out.println(" ".repeat(n - i) + "#" + " ".repeat(2 * n - 1) + "#");
            } else {
                System.out.println(" ".repeat(n - i) + "#" + " ".repeat(2 * i - 3) + "#" + " ".repeat(2 * (n - i) + 1) + "#" + " ".repeat(2 * i - 3) + "#");
            }
        }
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println(" ".repeat(n) + " ".repeat(n - i) + "#");
            } else {
                System.out.println(" ".repeat(n) + " ".repeat(n - i) + "#" + " ".repeat(2 * i - 3) + "#");
            }
        }
    }
}
