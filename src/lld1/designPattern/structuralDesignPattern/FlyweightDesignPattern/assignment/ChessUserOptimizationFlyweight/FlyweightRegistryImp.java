package designPattern.structuralDesignPattern.FlyweightDesignPattern.assignment.ChessUserOptimizationFlyweight;

import java.util.HashMap;

public class FlyweightRegistryImp implements FlyweightRegistry{
    private HashMap<String,UserIntrinsicState> hashMap;

    public FlyweightRegistryImp() {
        this.hashMap = new HashMap<>();
    }

    public void addFlyweight(UserIntrinsicState flyweight) {
        hashMap.put(flyweight.getEmail(), flyweight);
    }

    public UserIntrinsicState getFlyweight(String email) {
        return hashMap.get(email);
    }
}
