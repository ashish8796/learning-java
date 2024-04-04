package designPattern.behaviouralDesignPattern.ObserverDesignPattern.assignment.TaskManagementObserver;

public class TaskManager extends Publisher {
    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId);
    }
}
