package designPattern.DesignPatternPractice;

public class Main {
    public static void main(String[] args) {
        DbConnectionSingleton dbConnection1 = new DbConnectionSingleton();
        DatabaseBuilder db = new DatabaseBuilder.Builder().hostname("http://localhost:").port(3000).username("root").password("password").build();
        System.out.println(db.toString());
    }
}
