package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.StockTradingStrategyPattern;

public class VolatilityTradingStrategy implements TradingIndicatorStrategy{
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    public  Double calculateTradingStrategy(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}
