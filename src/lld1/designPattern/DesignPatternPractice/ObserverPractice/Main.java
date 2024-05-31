package designPattern.DesignPatternPractice.ObserverPractice;

public class Main {
    public static void main(String[] args) {
        NewspaperPublisher publisher = new NewspaperPublisher();
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();

        publisher.register(emailSender);
        publisher.register(smsSender);

        publisher.publishNewPaper("Paper1");
    }
}
