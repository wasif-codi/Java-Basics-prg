package arrayss;

public class ReverseArWithSwapping {

    // method to printing array elements
    static void printArray(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //method to swapping the elements
    static void swap(int[] arr, int i, int j) {
         int temp;
         temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      }

      // method to reverse an array
    static void ReverseArray(int[] arr) {
        int j = arr.length-1;
        int i = 0;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

        // main method to execute the program
        public static void main (String[]args){

          int[] ans = {10,20,30,40,50,88};
          ReverseArray(ans);
          printArray(ans);

          }

        }




