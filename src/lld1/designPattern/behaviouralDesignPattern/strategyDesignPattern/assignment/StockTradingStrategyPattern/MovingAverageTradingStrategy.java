package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.StockTradingStrategyPattern;

public class MovingAverageTradingStrategy implements TradingIndicatorStrategy{
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    public  Double calculateTradingStrategy(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}
