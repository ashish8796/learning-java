package designPattern.structuralDesignPattern.AdapterDesignPattern.Lecture.BankAPIGateway;

public interface BankApiAdapter {
    double checkBalance (User user);

    boolean changePin(User user, int currentPin, int newPin);

    double doTransaction(User fromUser, User toUser, double amount);
}
