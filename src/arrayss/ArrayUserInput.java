package Arrays;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();

        int [] arr = new int[n];

        System.out.print("Enter " +n+ " elements");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

         System.out.print("The elements of array are : ");
         for(int i =0;i<n;i++){
             System.out.print(arr[i] + " ");
         }

    }
}
