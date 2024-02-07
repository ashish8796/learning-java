package concurrency.CallableDemo.Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executor;

    TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {

        // calculating the size of the binary tree
        if (root == null) {
            return 0;
        }
        else {
            Future<Integer> leftCalculator = executor.submit(new TreeSizeCalculator(root.left, executor));
            Future<Integer> rightCalculator = executor.submit(new TreeSizeCalculator(root.right, executor));

            return 1 + leftCalculator.get() + rightCalculator.get();
        }
    }
}
