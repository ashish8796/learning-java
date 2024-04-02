package designPattern.structuralDesignPattern.FlyweightDesignPattern.assignment.FlyweightGraphic;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImp implements FlyweightRegistry{
    private Map<GraphicType, GraphicIntrinsicState> map = new HashMap<>();

    public void addFlyweight(GraphicIntrinsicState flyweight) {
        map.put(flyweight.getType(), flyweight);
    }

    public GraphicIntrinsicState getFlyweight(GraphicType graphicType) {
        return map.get(graphicType);
    }
}
