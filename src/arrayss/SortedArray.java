package arrayss;

import java.util.Scanner;
// code to check whether the given array is sorted or not
public class SortedArray {
    static boolean IsSorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                // not sorted
                check=false;
                break;

            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scan.nextInt();
        int[] arrr= new int[n];

        System.out.println("Enter elements of array");
        for(int i=0;i< arrr.length;i++){
            arrr[i]=scan.nextInt();
        }
       // System.out.println("Is Sorted: "+IsSorted(arrr));
         boolean  b =IsSorted(arrr);
        System.out.println("Is Sorted: "+b);

    }
}

