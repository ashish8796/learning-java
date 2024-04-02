package designPattern.behaviouralDesignPattern.strategyDesignPattern.Lecture;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(Mode mode) {
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
            default -> null;
        };
    }
}
