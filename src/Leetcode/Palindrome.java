package Leetcode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
//        System.out.println(isPalindrome(num));
        System.out.println(divide(num,num2));
    }
    public static boolean isPalindrome(int x) {
        int copy = x;
        int rev = 0;
        int rem;
        if (x<0){
            return false;
        }
        boolean ans;
        while (copy > 0) {
            rem = copy % 10;
            rev = (rev * 10) + rem;
            copy = copy / 10;
        }
        if (rev == x){
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }
    public static int divide(int dividend, int divisor) {
        int q = 0;
        boolean dividendSign = dividend >= 0;
        boolean divisorSign = divisor >= 0;
        System.out.println(dividendSign);
        System.out.println(divisorSign);
        if (dividend < 0){
            dividend = -dividend;
        }
        if (divisor < 0) {
            divisor = -divisor;
        }
        System.out.println(dividend);
        System.out.println(divisor);
        while (dividend>=divisor) {
            q++;
            dividend = dividend - divisor;
        }
        if (dividendSign && divisorSign == false) {
            q =-q;
            System.out.println("if cond");
        }
        return q;
    }
//    public static int majorityElement(int[] nums) {
//        int rep;
//        for (int ele:nums){
//
//        }
//        return ;
//    }
}
