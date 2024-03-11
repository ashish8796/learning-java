package designPattern.structuralDesignPattern.Lecture.BankAPIGateway;

public class PhonePe {
    private BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = new YesBankApiAdapter();
    }

    public double checkBalance(User user) {
        return bankApiAdapter.checkBalance(user);
    }

    public boolean changePin(User user, int currentPin, int newPin) {
        return bankApiAdapter.changePin(user, currentPin, newPin);
    }

    public double doTransaction(User fromUser, User toUser, double amount) {
        return bankApiAdapter.doTransaction(fromUser, toUser, amount);
    }
}
