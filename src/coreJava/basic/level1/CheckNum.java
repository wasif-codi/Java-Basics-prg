package coreJava.basic.level1;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        if(n>0){
            System.out.println(n+ " is positive number ");
        } else if (n<0) {
            System.out.println(n+ " is negative number");
        int a =10;
        }else {
            System.out.println(n+ " is zero number");
        }
    }
}
