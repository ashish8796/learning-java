package designPattern.behaviouralDesignPattern.CommandDesignPattern;

public class Light {
    boolean turnOn = false;

    public boolean isTurnOn() {
        return this.turnOn;
    }

    //receiver method : receives and acts on the command
    public void turnOn() {
        this.turnOn = true;

        System.out.println("Light is turned on.");
    }
}
