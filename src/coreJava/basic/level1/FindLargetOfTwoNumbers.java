package coreJava.basic.level1;

import java.util.Scanner;

public class FindLargetOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("enter first number ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNum = scanner.nextInt();

//        if(firstNum>secondNum){
//            System.out.println(firstNum +" greater than "+secondNum);
//        }else {
//            System.out.println(secondNum +" greater than "+firstNum);
//        }
        System.out.println("enter third number");
        int thirdNum= scanner.nextInt();
        if(firstNum>secondNum && firstNum> thirdNum){
            System.out.println(firstNum +" greater than "+secondNum +" and "+thirdNum);
        }
        else if(secondNum>firstNum && secondNum > thirdNum){
            System.out.println(secondNum +" greater than "+firstNum +" and "+thirdNum);
        }else {
            System.out.println(thirdNum +" greater than "+firstNum +" and "+secondNum);
        }
    }
}
