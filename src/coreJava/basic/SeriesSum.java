package coreJava.basic;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {

        // find the sum of the series  1-2+3-4+5..........
        // even no is added & odd no is subtracted

        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of series : ");
        int num = sc.nextInt();
        for(int i = 0 ; i< num ; i++){
            if(i %2 == 0){
                ans = ans+ i;

            }else {
                ans = ans-i;
            }
        }
        System.out.println("sum of the series : "+ans);
    }
}
