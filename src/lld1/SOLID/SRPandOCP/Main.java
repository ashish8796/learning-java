package SOLID.SRPandOCP;

public class Main {
    public static void main(String[] args) {
        Bird crow = new Crow(250, "black", "crow");
        Penguin penguin = new Penguin();
        Eagle newBird = new Eagle();




        crow.makeSound();
        penguin.makeSound();

        penguin.fly();
        crow.fly();
        newBird.fly();
    }
}
