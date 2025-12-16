package coreJava.basic.level1;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {            // even numbers from 1 to N
                System.out.print(i + " ");
            }
        }
    }
}
