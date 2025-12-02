package coreJava.basic;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int num = scanner.nextInt();
        int original = num;
        int reverse = 0;
        while (num > 0 ){
            reverse = reverse *10 +num % 10 ;
            num/= 10;                        // num = num /10;
        }
        System.out.println("Reverse of " +original +" is "+ reverse);
    }
}
