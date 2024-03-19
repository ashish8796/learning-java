package designPattern.structuralDesignPattern.AdapterDesignPattern.Lecture.BankAPIGateway;

public class AxisBankAPIAdapter implements BankApiAdapter{
    private AxisBankAPI axisBankAPI = new AxisBankAPI();

    public double checkBalance(User user) {
        axisBankAPI.checkBalance(generateUserToken(user));
        return 10000;
    }

    public boolean changePin(User user, int currentPin, int newPin) {
        return axisBankAPI.changePin(generateUserToken(user), newPin, currentPin);
    }

    public double doTransaction(User fromUser, User toUser, double amount) {
        return axisBankAPI.transferMoney(generateUserToken(fromUser),
                generateUserToken(toUser),
                amount);
    }

    private String generateUserToken(User user){
        return user.getUsername() + user.getPassword(); // random token
    }
}
