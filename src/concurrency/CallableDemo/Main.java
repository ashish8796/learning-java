package concurrency.CallableDemo;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // You are given a list of integers. You need to sort the array using ExecutorService

        List<Integer> l = List.of(7,3,1,2,4,6,17,12);
        Sorter sorter = new Sorter(l);

        List<Integer> output = sorter.call();
        System.out.println(output);

    }
}
