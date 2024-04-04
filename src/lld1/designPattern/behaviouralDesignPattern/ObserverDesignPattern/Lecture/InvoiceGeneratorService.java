package designPattern.behaviouralDesignPattern.ObserverDesignPattern.Lecture;

public class InvoiceGeneratorService implements OrderPlacedSubscriber{
    @Override
    public void oderPlacedEvent() {
        System.out.println("Notification to the customer is triggered.");
    }
}
