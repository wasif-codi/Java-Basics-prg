package coreJava.basic.level1;

import java.util.Scanner;

public class MultiplicationNum {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number to print multiplication");
//        int n = scanner.nextInt();
//        int m =1;

        //Print multiplication table of a number
        for (int i = 1; i<=20;i++){
//            m= n*i;
//            System.out.println(n+ " * " +i+ " = "+m);
            for(int j = 1 ; j<=10 ;j++){
                System.out.println(i+ " * " +j+ " = "+i*j);
            }
            System.out.println();

        }
    }
}
