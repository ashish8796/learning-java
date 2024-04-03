package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.PricingCalculationStrategy;

public class RideDetails {
    private double distance; // Distance in kilometers
    private int duration;

    public RideDetails(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}
