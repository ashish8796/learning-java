package lld1.designPattern.singletonDesignPattern.Lecture;

public class DBConn {
    private int noOfConn = 0;
    private static DBConn instance; // store address to DBConn object in heap
    private final int limit = 10;

    public static DBConn getInstance() {
        if(instance == null) {
            instance = new DBConn();
        }

        return instance;
    }

    public boolean connect() {
        if(noOfConn < limit) {
            noOfConn++;
            return true;
        }

        return false;
    }
}
