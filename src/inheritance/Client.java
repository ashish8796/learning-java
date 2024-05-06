package inheritance;

import java.util.Stack;

public class Client implements MyInterface {
    public static void main(String[] args) {
        C objC = new C();
        P obj = new C();

        obj.fun1();
        obj.fun();
        obj.sfun();
    }

    @Override
    public void abstractMethod() {

    }
}
