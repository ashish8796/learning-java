package designPattern.builderDesignPattern.Lecture;

import designPattern.builderDesignPattern.Lecture.exception.InvalidEmailException;
import designPattern.builderDesignPattern.Lecture.exception.InvalidNameException;
import designPattern.builderDesignPattern.Lecture.exception.InvalidPhoneNumberException;

public class Student {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private int gradYear;
    private int psp;
    private String universityName;

    private Student(int id, String name, String email, String phoneNumber, int gradYear, int psp, String universityName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gradYear = gradYear;
        this.psp = psp;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public static StudentBuilder studentBuilder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private String email;
        private String phoneNumber;
        private int gradYear;
        private int psp;

        private String universityName;

        public StudentBuilder id(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder email(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public void validate() {
            if(this.name == null) {
                throw new InvalidNameException();
            }
            if(this.email == null) {
                throw new InvalidEmailException();
            }
            if(this.phoneNumber == null) {
                throw new InvalidPhoneNumberException();
            }
        }

        public Student build() {
            validate();
            return new Student(id, name,  email,  phoneNumber,  gradYear, psp, universityName);
        }
    }

}
