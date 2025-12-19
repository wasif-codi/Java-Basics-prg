package coreJava.basic.level2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n  = sc.nextInt();
        int sum =1;

        for(int i =1 ; i<=n; i++){
            sum= sum*i;
        }
//        System.out.println(sum);
//        for(int i =n ; i>0;i=i/10){
//            sum = sum*i;
//        }
        System.out.println(sum);
    }
}
