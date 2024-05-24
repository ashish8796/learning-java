package SOLID.SRPandOCP;

public class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Fly like Eagle");
    }

    @Override
    public void makeSound() {
        System.out.println("Sounds like eagle.");
    }
}
