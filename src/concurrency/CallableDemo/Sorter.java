package concurrency.CallableDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    private ExecutorService executorService;

    Sorter(List<Integer> arr, ExecutorService executorService) {
        this.arr = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // base case
        if(arr.size() <= 1) {
            return arr;
        }

        //recursive case
        int n = arr.size();
        int mid = n/2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        //Division of array into 2 parts
        for(int i = 0; i < n; i++) {
            if (i < mid) {
                leftArr.add(arr.get(i));
            } else {
                rightArr.add(arr.get(i));
            }
        }

        //Recursively Sort the 2 array
        Sorter leftSorter = new Sorter(leftArr, executorService);
        Sorter rightSorter = new Sorter(rightArr, executorService);

        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture =executorService.submit(rightSorter);

//        leftArr = leftSorter.call();
//        rightArr = rightSorter.call();

        leftArr = leftFuture.get();
        rightArr = rightFuture.get();

        // Merge
        List<Integer> output = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < leftArr.size() && j < rightArr.size()) {
            if (leftArr.get(i) < rightArr.get(j)) {
                output.add(leftArr.get(i));
                i++;
            } else {
                output.add(rightArr.get(j));
                j++;
            }
        }

// Copy remaining elements from leftArr, if any
        while (i < leftArr.size()) {
            output.add(leftArr.get(i));
            i++;
        }

// Copy remaining elements from rightArr, if any
        while (j < rightArr.size()) {
            output.add(rightArr.get(j));
            j++;
        }
        return output;
    }
}
