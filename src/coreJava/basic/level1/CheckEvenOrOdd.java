package coreJava.basic.level1;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check: ");
        int n = scanner.nextInt();
        if(n % 2 == 0){
            System.out.println("number is even ");
        }else {
            System.out.println("number is odd");
        }
    }
}
