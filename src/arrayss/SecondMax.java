package arrayss;

import java.util.Scanner;

public class SecondMax {

    static int Max(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return  mx;
    }
    static int SecondMaxNum(int [] arr1){
        int max= Max(arr1);
        for(int i = 0; i <arr1.length; i++){
            if(arr1[i] == max){
                arr1[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = Max(arr1);
        return  secondMax;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= scan.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter "+n+ " Elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("largest elements in array is " +Max(arr));
        System.out.println("Second max elements in array is " +SecondMaxNum(arr));

    }
}
//2,4,6,9,8,7