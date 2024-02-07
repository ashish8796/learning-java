package concurrency.CallableDemo.Assignment;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ExecutorService executor = Executors.newCachedThreadPool();

        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executor);
        Future<Integer> output = executor.submit(calculator);

        System.out.println("Size of the binary tree is " + output.get());
    }
}
