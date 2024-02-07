package concurrency.ExecutorDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        // TODO: instead of creating one thread for each number printing use 10 threads only because it will cause problems

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i = 1; i <= 100; i++) {
            executor.execute(new NumberPrinter(i));
        }
        executor.shutdown();
    }
}
