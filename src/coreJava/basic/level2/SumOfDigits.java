package coreJava.basic.level2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // print sum of digits of a number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to sum its digits");
        int n = scanner.nextInt();
        int sum =0;
        while (n>0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("sum : "+sum);
    }
}
