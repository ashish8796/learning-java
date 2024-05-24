package SOLID.SRPandOCP;


// Follow SRP and OCP
public abstract class Bird {
    private int weight;
    private String color;
    private String name;

    public Bird() {
    }

    public Bird(int weight, String color, String name) {
        this.weight = weight;
        this.color = color;
        this.name = name;
    }


    // Violets OCP and SRP because when a new bird extends Bird class,
    // fly method needs to modify and needs to check the type
//    public void fly(String type) {
//        if (type.equals("eagle")) {
//            System.out.println("Fly like eagle");
//        } else if (type.equals("penguin")) {
//            System.out.println("Can't fly");
//        } else if (type.equals("parrot")) {
//            System.out.println("Fly like parrot");
//        } else if(type.equals("crow")) {
//            System.out.println("Fly like crow");
//        }
//    }

    public abstract void fly();

    public void eat() {

    }


    // violets SRP because needs to check the bird and then make the sound
//    public void makeSound() {
//        if(name.equals("crow")) {
//            System.out.println("caw caw");
//        } else if(name.equals("Cuckoo")) {
//            System.out.println("koo koo");
//        } else if(name.equals("peacock")) {
//            System.out.println("scream scream");
//        } else if(name.equals("penguin")) {
//            System.out.println("squawk squawk");
//        }
//    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
