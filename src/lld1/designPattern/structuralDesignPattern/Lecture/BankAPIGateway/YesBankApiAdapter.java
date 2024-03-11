package designPattern.structuralDesignPattern.Lecture.BankAPIGateway;

public class YesBankApiAdapter implements BankApiAdapter{
    private YesBankAPI yesBankApi = new YesBankAPI();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankApi.getBalance(user);
        return (double)balance;
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankApi.changePin(user.getUsername(), user.getPassword(), currentPin, newPin);
    }

    @Override
    public double doTransaction(User fromUser, User toUser, double amount) {
        char res = yesBankApi.doTransaction(fromUser, toUser, fromUser.getPassword(), amount);
        if(res == 'y')
            return 1;
        else if(res == 'N')
            return 0;
        else
            return 2;
    }
}
