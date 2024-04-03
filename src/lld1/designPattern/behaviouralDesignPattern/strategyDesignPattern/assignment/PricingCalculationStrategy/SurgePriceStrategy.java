package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.PricingCalculationStrategy;

public class SurgePriceStrategy implements  PricingStrategy{
    private static final double BASE_FARE = 5.0;
    private static final double SURGE_MULTIPLIER = 2.0;
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    public Double calculateRidePrice(RideDetails rideDetails) {
        return (SURGE_MULTIPLIER * BASE_FARE);
    }
}
