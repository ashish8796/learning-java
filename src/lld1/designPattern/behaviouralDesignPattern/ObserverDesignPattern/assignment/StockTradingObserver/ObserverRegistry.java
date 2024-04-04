package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.StockTradingObserver;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double currentPrice);

}
