package coreJava.basic.level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);

        switch(op){
            case '+' :
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case'/':
                if(b==0){
                    System.out.println("can not devide by zero");
                }else {
                    System.out.println(a/b);
                }
             break;
            default:
                   System.out.println("invalid operator ");
        }

    }
}
