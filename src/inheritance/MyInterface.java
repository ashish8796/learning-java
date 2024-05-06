package inheritance;

public interface MyInterface {
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    void abstractMethod();
}
