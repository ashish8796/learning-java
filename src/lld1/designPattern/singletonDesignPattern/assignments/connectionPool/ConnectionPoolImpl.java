package designPattern.singletonDesignPattern.assignments.connectionPool;

public class ConnectionPoolImpl implements ConnectionPool{
    public void initializePool() {

    }

    @Override
    public DatabaseConnection getConnection() {
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {

    }

    @Override
    public int getAvailableConnectionsCount() {
        return 0;
    }

    @Override
    public int getTotalConnectionsCount() {
        return 0;
    }
}
