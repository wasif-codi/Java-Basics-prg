package arrayss;
import java.util.Scanner;
public class KthRotationInArray {
    static int[] Rotate(int[] arr, int k){
        int n=arr.length;
         k = k%n;
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
        int [] ans= {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter K value");
        int k =sc.nextInt();

        int[] answer=Rotate(ans,k);
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }

    }
}
