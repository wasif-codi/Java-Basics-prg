package demo.interview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        //10,15,8,49,25,98,32,14
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 14);
        List<Integer> collect = numbers.stream().filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);

        List lst = new ArrayList();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("a");
        System.out.println(lst.remove("a") + " " + lst.remove("x"));


//        try
//        {
//            System.out.println("Under try block");
//        }
//        catch (Exception e)
//        {
//            System.out.println("Under First catch");
//        }
//
//        catch(IOException ie)
//        {
//            System.out.println(" under second catch"  );
//
//
//        }
//    }


    }

    class Parent {
        public void display() throws Exception {
            System.out.println("Parent Class");
        }
    }

    class Child extends Parent {
        public void display() throws IOException {
            System.out.println("child class");
        }

        public void main1(String args[]) {
            System.out.println("Main class ");
        }
    }
}
