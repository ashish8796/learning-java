package inheritance;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(8, 8);
        Object obj = new Point(8, 8);
//        point.equals(obj);

        String[] strList = {"Hi", "Hello", "Namste"};
        Integer[] numList = {7, 8, 9};

        char c1 = 'S';
        char c2 = 'C';
        Scanner scn = new Scanner(System.in);



        String s1 = scn.next();

        String s2 = scn.next();

        System.out.println(s1);
        System.out.println(s2);



        if(s1.equals(s2)) {

            System.out.println("Strings are equal");

        }

        else {

            System.out.println("Strings are not equal");

        }

//        System.out.println(c1 + c2 + "ALER");


        List<Type> list = new ArrayList<Type>();

//        printArray(strList);
//        printArray(numList);

    }

    public static <Type> void printArray(Type[] list) {
        for(Type v : list) {
            System.out.println(v);
        }
    }
}
