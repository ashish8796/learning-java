package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.StockTradingObserver;

public interface Observer {
    void notifyObserver(String stockName, double currentPrice);
}
