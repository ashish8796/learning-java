package designPattern.creationalDesignPattern.RegistryDesignPattern.Lecture;

public class Main {
    public static void main(String[] args) {
        Student studentPrototypeBatchA = new Student("2023", "BatchA", "HLD", "Sandeep", "12-June-23", "MWF", "30-Apr-2024");
        Student studentPrototypeBatchB = new Student("2023", "BatchB", "LLD", "naman", "12-Dec-23", "TTS", "30-June-2024");
        Student studentPrototypeBatchC = new Student("2024", "BatchC", "DSA", "mohit", "12-Jan-24", "MWF Morning", "30-Dec-2024");

        StudentRegistry studentRegistry = new StudentRegistry();

        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);

        Student ashish = studentRegistry.get("BatchA").clone();
        ashish.setName("Ashish");
        ashish.setEmail("a@email.com");
        ashish.setPassword("abcd1234");

        System.out.println(ashish.toString());
        System.out.println(studentPrototypeBatchA.toString());
    }
}
