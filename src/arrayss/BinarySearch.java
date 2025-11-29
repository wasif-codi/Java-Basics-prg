package arrayss;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {122,31,475,70,90,7};
        int target = 31 ;
 // first sort the array and then apply binary search
       bubbleSort(arr);
        System.out.println("sorted array : ");
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int num= binarySearch(arr,target);
        System.out.println("target found at: " +num);

    }

    public static int binarySearch(int[] arr , int target){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low + high)/2 ;
            if(target == arr[mid]){
                return mid;

            }else if(target < arr[mid]){
                high = mid -1 ;

            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[]  arr ){
        for(int i =0 ; i< arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    static void swap(int [] arr, int i,int j){
            int temp = arr[i ];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
