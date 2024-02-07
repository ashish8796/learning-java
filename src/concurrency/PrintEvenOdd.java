package concurrency;

public class PrintEvenOdd implements Runnable{
    int i;

    public PrintEvenOdd(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i + " is printed from " + Thread.currentThread().getName());
    }
}
