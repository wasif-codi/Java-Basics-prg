package arrayss;

import java.util.Scanner;

public class TripletSum {

    static int TripletSum(int[] arr, int Target){
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){ // Finding first number
            for(int j =i+1; j<n; j++){ // finding second number
                for(int k =j+1; k<n; k++){ // finding third number
                    if(arr[i]+arr[j]+arr[k] == Target)// checking target value
                        ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+ n+ " Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target sum");
        int Target=sc.nextInt();
        System.out.println(TripletSum(arr,Target));

    }
}
