package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.StockTradingObserver.services;

import designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.StockTradingObserver.Observer;
import designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.StockTradingObserver.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}
