package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.PricingCalculationStrategy;

public class DistanceBasedPricingStrategy implements PricingStrategy{
    private static final double BASE_FARE = 5.0;
    private static final double PER_KILOMETER_RATE = 2.0;
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }

    public Double calculateRidePrice(RideDetails rideDetails) {
        return (BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance());
    }
}
