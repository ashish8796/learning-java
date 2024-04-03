package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.StockTradingStrategyPattern;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    Double calculateTradingStrategy(Stock stock);
}
