package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.PricingCalculationStrategy;

public interface PricingStrategy {
    PricingType supportsType();

    Double calculateRidePrice(RideDetails rideDetails);
}
