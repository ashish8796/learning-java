package designPattern.structuralDesignPattern.FlyweightDesignPattern.assignment.ChessUserOptimizationFlyweight;

public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;

    private UserIntrinsicState user;

    public UserIntrinsicState getUser() {
        return user;
    }

    public void setUser(UserIntrinsicState user) {
        this.user = user;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public void setCurrentGameStreak(int currentGameStreak) {
        this.currentGameStreak = currentGameStreak;
    }
}
