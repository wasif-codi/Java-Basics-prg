package arrayss;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;
import java.util.Arrays;

public class Inheritance {
    public static void main(String[] args) {

       // Fibonacci Series
        int firstTerm = 0 ;
        int secondTerm = 1;
        int nextTerm ;

        for(int i = 0 ; i< 5 ; i++){

            System.out.print(firstTerm +" ");

            nextTerm = firstTerm + secondTerm ;
            firstTerm = secondTerm ;
            secondTerm = nextTerm;

        }

//        int a = 8 ;
//        int b = 10;
//        int c = a % b;
      //  System.out.println("value of 8% 10 : "+ 9 % 10);
//        Child c = new Child();
//        c.say();

//        Employee e1 = new Employee("YOUR_NAME");
//        Employee e2 = new Employee("YOUR_NAME");
//        System.out.println(e1==e2);
//        System.out.println(e1.equals(e2));
        List<Integer> list = Arrays.asList(1,2,34,5);
    }
}
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
}
