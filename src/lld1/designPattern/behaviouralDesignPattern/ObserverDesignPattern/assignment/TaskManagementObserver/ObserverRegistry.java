package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.TaskManagementObserver;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Long taskId, Long userId);
}
