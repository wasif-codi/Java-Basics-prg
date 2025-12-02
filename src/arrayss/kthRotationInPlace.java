package arrayss;

import java.util.Scanner;

public class kthRotationInPlace {
    static void printArray(int []arr) {                 // function for printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static void swap(int[] arr, int i, int j) {       // function for swapping
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void ReverseArray(int[] arr , int i, int j) {            // function for Reversing array
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void ChangeInPlace(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        ReverseArray(arr,0,n-k-1);
        ReverseArray(arr,n-k,n-1);
        ReverseArray(arr,0,n-1);
    }

    static int[] Rotate(int[] arr, int k){
        int n=arr.length;
        k= k%n;
        int[] ans= new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int[] ans = new int[n];

        System.out.println("enter array elements");
        for(int i =0; i<ans.length;i++){
            ans[i]=sc.nextInt();
        }

        System.out.print("Enter K value");
        int k =sc.nextInt();

        printArray(ans);
        ChangeInPlace(ans,k);



    }

}
