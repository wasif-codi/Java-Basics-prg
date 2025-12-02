package arrayss;

import java.util.Scanner;

public class CountLastIndexArray {
    static int CountLastIndexOccur(int[] arr, int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                lastIndex = i;
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= scan.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the elements  of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the value of x");
        int x= scan.nextInt();
        System.out.println("Occurrence of Last index "+CountLastIndexOccur(arr ,x));


    }
}
