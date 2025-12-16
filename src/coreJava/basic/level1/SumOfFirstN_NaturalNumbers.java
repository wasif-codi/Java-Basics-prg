package coreJava.basic.level1;

import java.util.Scanner;

public class SumOfFirstN_NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find sum");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ;i++){
                sum+= i;                             // sum = sum+i

        }
        System.out.println("sum of first N natural numbers : "+sum);
    }
}
