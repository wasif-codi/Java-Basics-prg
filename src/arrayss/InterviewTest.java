package arrayss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InterviewTest {
        public static void main (String[] args){

//            int n = 5;
//            for(int i = n ;i>=1 ; i--){
//                for(int j =i ;j<n ; j++){
//                    System.out.print(" ");
//
//                }
//                for(int k = 1 ; k<=i; k++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }
            //find 2nd max
            List<Integer> numbers = Arrays.asList(2,0,8,4,9,1);

           Integer i = numbers.stream().distinct().sorted(Comparator.reverseOrder())
                    .skip(1).findFirst().orElse(null);

            System.out.println("seond max is : "+i);
        }
}
