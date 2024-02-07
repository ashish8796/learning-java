package concurrency.ExecutorDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // TODO: Write code for printing numbers from 1 to 100 in different threads;
        for(int i = 1; i <= 100; i++) {
            NumberPrinter printer = new NumberPrinter(i);

            Thread t = new Thread(printer);
            t.start();
        }


    }
}
