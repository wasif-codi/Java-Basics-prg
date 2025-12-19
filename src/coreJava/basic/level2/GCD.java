package coreJava.basic.level2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter another number");
        int b = scan.nextInt();
        // using normal approach
        int gcd = 1;
        for(int i = 1 ; i<=a && i<=b; i++){
            if(a% i ==0 && b%i ==0){
                gcd = i;
            }
        }
        System.out.println("using brute force gcd : "+gcd);



           // euclidean algorithm
        while (b!=0){
            int remainder = a%b;
            a = b;
            b= remainder;
        }
        System.out.println("using euclidean algorithm : "+a);

    }
}
