package fundamentalOfJava.Constructor;

public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.name = "Ashish";
        newStudent.email = "a@email.com";


        Student s2 = new Student();
        s2.name = "Hulu";
        s2.email = "b@email.com";

        s2.faltu = "faltu";


        newStudent.staticMethod();
        System.out.println(s2.faltu);
        System.out.println(Student.faltu);

    }
}
