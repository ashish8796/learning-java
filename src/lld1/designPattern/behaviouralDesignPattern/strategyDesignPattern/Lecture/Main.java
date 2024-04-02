package designPattern.behaviouralDesignPattern.strategyDesignPattern.Lecture;

public class Main {
    public static void main(String[] args) {
        Maps maps = new Maps();

        maps.findPath("Delhi", "Lucknow", Mode.WALK);
    }
}
