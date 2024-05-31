package designPattern.DesignPatternPractice.ObserverPractice;

public class EmailSender implements Observer{

    public void sendEmail() {
        System.out.println("Email is sent.");
    }
    @Override
    public void notifyChange() {
        sendEmail();
    }
}
