package SOLID.SRPandOCP;

public class Penguin extends Bird{
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }

    @Override
    public void makeSound() {
        System.out.println("squawk squawk");
    }
}
