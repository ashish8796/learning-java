package designPattern.structuralDesignPattern.FlyweightDesignPattern.assignment.FlyweightGraphic;

public interface FlyweightRegistry {
    void addFlyweight(GraphicIntrinsicState flyweight);

    GraphicIntrinsicState getFlyweight(GraphicType graphicType);
}
