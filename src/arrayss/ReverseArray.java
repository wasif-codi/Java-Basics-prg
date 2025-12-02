package arrayss;

// program to reverse an array
public class ReverseArray {


    // function to print array
    static void printArray(int [] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +" ");

        }
        System.out.println();
    }



    static int[] ReverseAr(int [] arr){
        int n= arr.length;
        int[] ans = new int[n];
        int j=0;
        int i=n-1;
        // using while loop
        while (i>=0){
            ans[j++] = arr[i--];

        }

//        for(int i = n-1; i>=0 ;i--){
//            ans[j++] = arr[i];
//         this line can also written as ans[j]= arr[i]
//                  //j++;
//        }

        return ans;
    }


    public static void main(String[] args) {
        int [] arr1 = {6,4,3,1,0};
        int[] reversedArray = ReverseAr(arr1);
        printArray(reversedArray);


    }

}
