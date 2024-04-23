package designPattern.behaviouralDesignPattern.CommandDesignPattern;

//invoker
public class RemoteControl {
    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
