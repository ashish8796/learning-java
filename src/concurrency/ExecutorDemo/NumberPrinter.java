package concurrency.ExecutorDemo;

public class NumberPrinter implements  Runnable {
    int i;

    NumberPrinter(int num) {
        this.i = num;
    }

    @Override
    public void run() {
        System.out.println("Number is " + i + " from " + Thread.currentThread().getName());
    }
}
