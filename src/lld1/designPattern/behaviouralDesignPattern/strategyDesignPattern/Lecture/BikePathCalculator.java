package designPattern.behaviouralDesignPattern.strategyDesignPattern.Lecture;

public class BikePathCalculator implements PathCalculator{
    public void findPath(String source, String destination) {
        System.out.println("Path via Bike from " + source + ", to " + destination);
    }
}
