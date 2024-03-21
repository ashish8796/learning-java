package designPattern.creationalDesignPattern.PrototypeDesignPattern.assignment.PrototypeCloningTesting;

import java.util.HashMap;

public class UserRegistry implements UserPrototypeRegistry{
    private HashMap<UserType, User> hashMap;

    public UserRegistry() {
        this.hashMap = new HashMap<>();
    }

    public void addPrototype(User user) {
        hashMap.put(user.getType(), user);
    }

    public User getPrototype(UserType type) {
        return hashMap.get(type);
    }

    public User clone(UserType type) {
        return hashMap.get(type).cloneObject();
    }
}
