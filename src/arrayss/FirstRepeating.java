package Arrays;

import java.util.Scanner;
// First Repeating number
public class FirstRepeating {

     static int FirstRepeatingNum(int[] arr){
         int ans=-1;
         for(int i=0;i<arr.length;i++){
             for (int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                     return arr[i];
             }
         }

     }
         return ans;
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= scan.nextInt();
        int[] arr= new int[n];

        System.out.print("Enter "+n+ " Elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("First Repeating Number of Array "+FirstRepeatingNum(arr));

    }
}
