package coreJava.basic.level2;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args){

         int n = 153;
        int sum =0;


         for(int i = n ; i>0 ; i=  i/10){
             int d = i %10 ;
             sum = sum+(d*d*d);
         }
         if(n == sum){
             System.out.println("Number is Armstrong");
         }else {
             System.out.println("number is not armstrong");
         }

    }
}
