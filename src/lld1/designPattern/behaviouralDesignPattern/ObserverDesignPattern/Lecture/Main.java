package designPattern.behaviouralDesignPattern.ObserverDesignPattern.Lecture;

public class Main {
    public static void main(String[] args) {
        CustomerNotificationService customerNotificationService = new CustomerNotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();

        Amazon amazon = new Amazon();
        amazon.addOrderPlaceSubscriber(customerNotificationService);
        amazon.addOrderPlaceSubscriber(invoiceGeneratorService);

        amazon.orderPlaced();
    }
}
