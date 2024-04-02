package designPattern.behaviouralDesignPattern.strategyDesignPattern.Lecture;

public class WalkPathCalculator implements PathCalculator{
    public void findPath(String source, String destination) {
        System.out.println("Path via Walk from " + source + ", to " + destination);
    }
}
