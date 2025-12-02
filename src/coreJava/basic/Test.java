package coreJava.basic;

public class Test {
    public static void main(String[] args) {
        //print 0 to 50 numbers except the multiple of 2
        for (int num = 0; num <= 50; num++) {
            if (num % 2 == 0) {
                continue; // continue will stop current iteration and next iteration will execute
            }
            System.out.print(num + " ");
        }

        System.out.println();
        // same using while loop
        int num = 1;
        while (num <= 50) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
            num++;

        }


        // infinite loop
        while (true){
            System.out.print(num+" ");
            num++;
        }
    }
}
