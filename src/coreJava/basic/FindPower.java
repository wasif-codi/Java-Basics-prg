package coreJava.basic;

import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {

        // Q:  Given two numbers a and b find a raise to the power b

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of and b: ");
        int a = scanner.nextInt() , b = scanner.nextInt();
        int ans = 1;
        for(int i = 1; i<=b ; i++){
            ans *= a;

        }
        System.out.println(ans);
    }
}
