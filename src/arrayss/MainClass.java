package arrayss;

public class MainClass {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,3,12,17,29,10};

        System.out.println("even numbers  :");
        filterEvenNumber(arr);

        int index = findIndex(arr,8);
        System.out.println("Index "+index);

        int index1 = findIndex(arr,11);
        System.out.println("Index "+index1);

    }

    //Filter out even number
    public static void filterEvenNumber(int[] arr){
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] % 2 ==0){
                System.out.println(arr[i]);
            }
        }

    }
    // returning the index of element if found , if not return -1
    public static int findIndex(int[] arr, int target){
        for(int i =0 ; i <arr.length; i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }





}
