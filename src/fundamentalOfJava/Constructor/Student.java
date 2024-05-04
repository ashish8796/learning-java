package fundamentalOfJava.Constructor;

public class Student {
     String name;
     String email;

     static String faltu = "Faltu";

     public static void staticMethod() {
         System.out.println("Static method is called.");
     }

    public void changeBatch(String batchName) {
    }

    public Student() {
    }

    public Student (Student student) {
        this.email = student.email;
        this.name = student.name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
