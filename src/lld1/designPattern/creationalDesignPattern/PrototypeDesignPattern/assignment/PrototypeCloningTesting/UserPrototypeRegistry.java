package designPattern.creationalDesignPattern.PrototypeDesignPattern.assignment.PrototypeCloningTesting;

import java.util.HashMap;

public interface UserPrototypeRegistry {
    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
