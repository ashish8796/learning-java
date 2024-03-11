package designPattern.creationalDesignPattern.singletonDesignPattern.assignments.connectionPool;

public interface ConnectionPool {
    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();
}
