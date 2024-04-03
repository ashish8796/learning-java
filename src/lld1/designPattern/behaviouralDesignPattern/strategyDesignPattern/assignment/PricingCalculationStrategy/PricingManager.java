package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.PricingCalculationStrategy;

public class PricingManager {
    private PricingStrategy pricingStrategy;
    private PricingType pricingType;

    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.pricingType = pricingType;
    }

    public PricingManager( PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
       return pricingStrategy.calculateRidePrice(rideDetails);
    }
}
