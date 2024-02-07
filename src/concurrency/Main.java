package concurrency;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            PrintEvenOdd printer = new PrintEvenOdd(i);
            Thread t= new Thread(printer);
            t.start();
        }
    }
}
