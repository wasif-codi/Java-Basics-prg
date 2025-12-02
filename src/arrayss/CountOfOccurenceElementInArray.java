package arrayss;

import java.util.Scanner;

public class CountOfOccurenceElementInArray {

    // Finding no of count of x element
    static int countOfOccurenceOfElement(int[] arr , int x){
        int  count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }


    // finding last count of x element
    static int lastCountX(int [] arr , int x){
       int  count = -1 ;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] == x){
                // keeps on updating the  x index finally it will assign last occurence of x
                count = i ;
            }
        }
        return count;
    }



    // Count the number of elements strictly greater than  value x
    static int strictlyGreater(int [] arr, int x){
        int count =0;
        for (int i =0; i<arr.length ; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Taking  array size from user input
        System.out.println("Enter size of array :");
        int n= scanner.nextInt();
        int [] arr = new int[n];

        // Taking array  elements from user input
        System.out.println("Enter " +n+ " elements in array");
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        // Taking x value from user input
        System.out.println("Enter X :");
        int x= scanner.nextInt();

       // System.out.println("Count of X :"+countOfOccurenceOfElement(arr,x));

       // System.out.println("Count of X :"+lastCountX(arr,x));

        System.out.println("Count of strictly greater than X :"+strictlyGreater(arr,x));
    }
}
