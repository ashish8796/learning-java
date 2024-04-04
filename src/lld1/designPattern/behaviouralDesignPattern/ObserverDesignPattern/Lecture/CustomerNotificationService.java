package designPattern.behaviouralDesignPattern.ObserverDesignPattern.Lecture;

public class CustomerNotificationService implements OrderPlacedSubscriber{
    @Override
    public void oderPlacedEvent() {
        System.out.println("Notification to the customer is triggered.");
        System.out.println("Send SMS to customer");
        System.out.println("Send email to customer");
    }
}
