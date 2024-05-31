package designPattern.DesignPatternPractice.ObserverPractice;

public class SmsSender implements Observer{
    public void sendSMS() {
        System.out.println("SMS is sent.");
    }
    @Override
    public void notifyChange() {
        sendSMS();
    }
}
