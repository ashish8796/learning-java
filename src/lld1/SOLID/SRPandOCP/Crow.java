package SOLID.SRPandOCP;

public class Crow extends Bird{
    public Crow() {
    }

    @Override
    public void fly() {
        System.out.println("Fly like Crow");
    }

    public Crow(int weight, String color, String name) {
        super(weight, color, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Caw Caw");
    }
}
