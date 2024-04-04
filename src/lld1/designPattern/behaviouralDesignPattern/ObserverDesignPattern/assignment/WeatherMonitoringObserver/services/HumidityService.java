package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.WeatherMonitoringObserver.services;

import designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.WeatherMonitoringObserver.Observer;
import designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.WeatherMonitoringObserver.utils.NotificationUtils;

public class HumidityService implements Observer {
    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}
