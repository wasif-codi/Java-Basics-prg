package patterns;

import java.util.Scanner;

public class NumericalNum {
    public static void main(String[] args) {

        /* print below patter
12121
21212
12121
21212   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row number ");
        int r = scan.nextInt();
        System.out.println("Enter column number ");
        int c = scan.nextInt();

        for(int i =1 ; i<= r ; i++){
            for(int j =1 ; j<=c;j++){
                if((i+j) % 2==0){
                    System.out.print("1");
                }else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
