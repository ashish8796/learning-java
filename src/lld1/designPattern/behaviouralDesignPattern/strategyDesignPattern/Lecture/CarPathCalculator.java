package designPattern.behaviouralDesignPattern.strategyDesignPattern.Lecture;

public class CarPathCalculator implements PathCalculator{
    public void findPath(String source, String destination) {
        System.out.println("Path via Car from " + source + ", to " + destination);
    }
}
