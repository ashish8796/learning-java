package inheritance;

public class Car {
    int lights;
    String shape;

    public Car(int lights, String shape) {
        this.lights = lights;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Car{" +
                "lights=" + lights +
                ", shape='" + shape + '\'' +
                '}';
    }
}
