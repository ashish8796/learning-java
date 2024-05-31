package designPattern.DesignPatternPractice;

public class DbConnectionSingleton {
    private DbConnectionSingleton dbConnection;

    public DbConnectionSingleton() {
    }

    public DbConnectionSingleton getConnection() {
        if(dbConnection == null) {
            synchronized (DbConnectionSingleton.class) {
                if(dbConnection == null) {
                    dbConnection = new DbConnectionSingleton();
                }
            }
        }

        return dbConnection;
    }
}
