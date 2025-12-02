package coreJava.basic;

public class ProblemsOnLoop {
    public static void main(String[] args) {
//        // count the number of digits in a number
//        int num = 1234;
//        int DigitCount =0;
//        for (int i = num;  num> 0; i++) {
//            num = num / 10;
//            DigitCount++;
//        }
//        System.out.println("using for loop "+DigitCount);

//  Using while loop
        int DigitCount =0;
        int number = 65478;
        int  n = number;
        while (number > 0) {
            number = number / 10;
            DigitCount++;
        }
        System.out.println("Number of digits in " +n+" : "+DigitCount);
    }
}
