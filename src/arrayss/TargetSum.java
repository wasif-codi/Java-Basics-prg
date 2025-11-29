package arrayss;
import java.util.Scanner;
    //Target sum Problem
  // This is a  BruteForce Approach not an Optimal one
public class TargetSum {
    static  int TargetSum(int[] arr, int Target){
        int count=0;
        for(int i=0;i<arr.length;i++){ // Traversing first number
            for(int j=i+1;j< arr.length;j++){  // Traversing second number
                if(arr[i]+arr[j]==Target)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " +n+ " Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter Target Sum");
        int TargetSum=scan.nextInt();
        System.out.println("pair occured: " + TargetSum(arr,TargetSum));



    }
}
