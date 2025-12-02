package coreJava.basic;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

//        // sum of digits of a number
//        // any number % 10 gives last digit of that number
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to get sum of its");
//        int num = scanner.nextInt();
//        int sumOfDigit=0;
//         mostly prefer while loop for number problem coz do not need index
//        while (num>0){
//            sumOfDigit = sumOfDigit+ num % 10 ; // gives last digit and add it to sum
//            num = num /10; // at every iteration it will remove one digit from number
//
//        }
//        System.out.println(sumOfDigit);

     // Using for loop
        int num = 987;
        int digitSum =0;

        //for (int i = num ;num>0; i++){
        for (;num>0; ){
            digitSum +=num%10;
            num= num/10;
        }
        System.out.println("sum of digits of a number : "+digitSum);

        for(;num>0;num /=10){
           int  lastDigit = num % 10;
            digitSum = digitSum + lastDigit;
        }
        System.out.println("sum :"+digitSum);


















    }

}
