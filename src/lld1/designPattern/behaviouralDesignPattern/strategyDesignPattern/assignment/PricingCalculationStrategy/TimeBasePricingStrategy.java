package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.PricingCalculationStrategy;

public class TimeBasePricingStrategy implements PricingStrategy{
    private static final double BASE_FARE = 5.0;
    private static final double PER_MINUTE_RATE = 0.5;

    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    public Double calculateRidePrice(RideDetails rideDetails) {
        return (BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration());
    }
}
