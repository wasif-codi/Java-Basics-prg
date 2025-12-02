package arrayss;

import java.util.Arrays;
import java.util.Scanner;
    // program to find Smallest & Largest elements of Array


public class SmallestAndLargestEleOfArray {

    static int[] SmallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length-1] };
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " +n+ " elements of array");
        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int []  answer = SmallestAndLargest(arr);
        System.out.println("Smallest Element of Array "+answer[0]);
        System.out.println("Largest Element of Array "+answer[1]);


    }
}
