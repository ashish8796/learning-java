package designPattern.structuralDesignPattern.FlyweightDesignPattern.assignment.ChessUserOptimizationFlyweight;

public interface FlyweightRegistry {
    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}
