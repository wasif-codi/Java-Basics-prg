package coreJava.basic.level2;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // count digit in a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scanner.nextInt();
        int digitCount=0;
        while (n>0){
             n=n/10;
            digitCount++;

        }
        System.out.println(digitCount);
    }
}
