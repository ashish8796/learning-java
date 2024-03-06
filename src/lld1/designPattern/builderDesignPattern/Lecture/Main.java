package designPattern.builderDesignPattern.Lecture;

public class Main {
    public static void main(String[] args) {
        Student s = Student.studentBuilder()
                .id(1)
                .name("Ashish")
                .universityName("MJPRU")
                .email("ashishsaini.ak@gmail.com")
                .gradYear(2024)
                .phoneNumber("1234567890")
                .build();

        System.out.println(s);
    }
}
