package designPattern.creationalDesignPattern.PrototypeDesignPattern.Lecture;

public class Student implements Prototype<Student> {
    private String name;
    private String email;
    private String password;
    private String yearOfEnrollment;
    private String batchName;
    private String moduleName;
    private String instructorName;
    private String moduleStartDate;
    private String moduleEndDate;
    private String moduleSchedule;

    public Student(String yearOfEnrollment, String batchName, String moduleName, String instructorName, String moduleStartDate, String moduleEndDate, String moduleSchedule) {
        this.yearOfEnrollment = yearOfEnrollment;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.instructorName = instructorName;
        this.moduleStartDate = moduleStartDate;
        this.moduleEndDate = moduleEndDate;
        this.moduleSchedule = moduleSchedule;
    }

    public Student(Student student) {
        this.yearOfEnrollment = student.yearOfEnrollment;
        this.batchName = student.batchName;
        this.moduleName = student.moduleName;
        this.instructorName = student.instructorName;
        this.moduleStartDate = student.moduleStartDate;
        this.moduleEndDate = student.moduleEndDate;
        this.moduleSchedule = student.moduleSchedule;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", yearOfEnrollment='" + yearOfEnrollment + '\'' +
                ", batchName='" + batchName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", moduleStartDate='" + moduleStartDate + '\'' +
                ", moduleEndDate='" + moduleEndDate + '\'' +
                ", moduleSchedule='" + moduleSchedule + '\'' +
                '}';
    }

    @Override
    public  Student clone() {
        System.out.println(this.toString());
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
