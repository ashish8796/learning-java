package designPattern.structuralDesignPattern.AdapterDesignPattern.Lecture.BankAPIGateway;

public class AxisBankAPI {
    public double checkBalance(String userToken) {
        return 1000;
    }

    public int transferMoney(String fromUserToken, String toUserToken, double amount){
        return 1;
    }

    public boolean changePin(String usertoken, int newpin, int currentPin){
        return true;
    }
}
