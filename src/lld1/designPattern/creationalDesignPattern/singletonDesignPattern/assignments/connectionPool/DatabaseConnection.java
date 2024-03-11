package designPattern.creationalDesignPattern.singletonDesignPattern.assignments.connectionPool;

public class DatabaseConnection {
    private String connectionStatus = "available";

    public DatabaseConnection() {
    }

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public void toggleConnectionStatus (String status) {
        this.connectionStatus = status;
    }
}
