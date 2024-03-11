package designPattern.creationalDesignPattern.singletonDesignPattern.assignments.connectionPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool{
    private static volatile ConnectionPoolImpl connectionPoolInstance;
    private int totalConnectionCount;
    private List<DatabaseConnection> poolArr = new ArrayList<>();
    private  int availableConnectionCount;


    private ConnectionPoolImpl(int maxConnections) {
        totalConnectionCount = maxConnections;
        this.initializePool();
    }


    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if(connectionPoolInstance == null) {
            synchronized(ConnectionPoolImpl.class) {
                if(connectionPoolInstance == null) {
                    connectionPoolInstance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }

        return connectionPoolInstance;
    }

    public static void resetInstance() {
        connectionPoolInstance = null;
    }

    public void initializePool() {
        for(int i = 0; i < this.totalConnectionCount; i++) {
            poolArr.add(new DatabaseConnection());
            this.availableConnectionCount++;
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        for (DatabaseConnection connection : poolArr) {
            if(connection.getConnectionStatus() == "available") {
                connection.toggleConnectionStatus("unavailable");
                this.availableConnectionCount--;
                return connection;
            }
        }

        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connection.toggleConnectionStatus("available");
        this.availableConnectionCount++;
    }

    @Override
    public int getAvailableConnectionsCount() {
        return this.availableConnectionCount;
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.totalConnectionCount;
    }
}
