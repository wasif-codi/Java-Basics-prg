package patterns;

public class TriangluarP {
    public static void main(String[] args){

        // print Triangular pattern
        // no of row is equal to no of column

       /* for(int i = 1 ; i<= 5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        */


        //Reverse Triangular pattern

//        for (int i = 5 ; i>=1 ; i--){
//            for(int j =1 ; j<= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

         /*
         print
         1
         12
         123
         1234
         */
        for(int i = 1 ; i<= 4 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
