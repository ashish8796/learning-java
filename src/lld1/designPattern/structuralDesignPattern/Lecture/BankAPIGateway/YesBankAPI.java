package designPattern.structuralDesignPattern.Lecture.BankAPIGateway;

public class YesBankAPI {
    public long getBalance(User user) {
        return 1000;
    }

    public boolean changePin(String username, String password, int currentPin, int newPin) {
        return true;
    }

    public char doTransaction(User fromUser, User toUser, String fromUserPassword, double amount) {
        return 'y';
    }
}
