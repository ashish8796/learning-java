package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.WeatherMonitoringObserver;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}
