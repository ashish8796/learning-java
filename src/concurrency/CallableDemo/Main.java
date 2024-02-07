package concurrency.CallableDemo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        // You are given a list of integers. You need to sort the array using ExecutorService

        List<Integer> l = List.of(7,3,1,2,4,6,17,12);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(l, executorService);

        Future<List<Integer>> output = executorService.submit(sorter);

//        List<Integer> output = sorter.call();

        System.out.println(output.get());
        executorService.shutdown();

    }
}
