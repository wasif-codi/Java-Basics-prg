package coreJava.basic.level2;

import java.util.Scanner;

public class ReverseNum {
    // reverse a number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        int n = scan.nextInt();
        int original=n;
        int rev = 0;
        while (n>0){
            rev = rev*10+n%10;
            n= n/10;
        }
        if(original == rev){
            System.out.println(original + " is a palindrome number");
        }else {
            System.out.println(original + " is not a palindrome number");
        }
        System.out.println();

        System.out.println("Reverse of "+original+ " : "+rev);
    }
}
