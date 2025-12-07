package patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row :");
        int r =  scanner.nextInt();
        for(int i = 1 ; i< r ; i++ ){
            for(int j = 1; j<= r-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<= 2*i-1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
