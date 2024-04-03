package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.StockTradingStrategyPattern;

public class MomentumTradingStrategy implements TradingIndicatorStrategy{
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    public  Double calculateTradingStrategy(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}
