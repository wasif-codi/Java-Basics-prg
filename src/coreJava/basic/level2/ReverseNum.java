package coreJava.basic.level2;

import java.util.Scanner;

public class ReverseNum {
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

        System.out.println("Reverse of "+original+ " : "+rev);
    }
}
