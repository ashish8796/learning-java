package designPattern.singletonDesignPattern.assignments.logger;

import org.springframework.boot.logging.LogLevel;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger{
    private static LoggerImpl loggerInstance;
    private String filePath;
    private static PrintWriter printWriter;
    private boolean isClosed = false;

    private LoggerImpl() {

    }

    public static LoggerImpl getInstance() {
        if(loggerInstance == null) {
            synchronized (LoggerImpl.class) {
                if(loggerInstance == null) {
                    loggerInstance = new LoggerImpl();
                }
            }
        }
        return loggerInstance;
    }

    public static LoggerImpl resetInstance() {
        loggerInstance = null;
        return loggerInstance;
    }


    @Override
    public void log(LogLevel level, String message){
        if(printWriter == null) {
            throw new IllegalStateException("Logger is not instantiated.");
        }
        if(this.isClosed) {
            throw new IllegalStateException("Logger is closed.");
        }
        printWriter.print(LocalDateTime.now()+" "+level + " " + message);
    }


    @Override
    public void setLogFile(String filePath) {
        try{
            this.filePath = filePath;
            printWriter = new PrintWriter(filePath);
        } catch(IOException e) {
            throw new RuntimeException(filePath);
        }
    }

    @Override
    public String getLogFile() {
        return this.filePath;
    }

    @Override
    public void flush() {
        printWriter.flush();
    }

    @Override
    public void close() {
        printWriter.close();
        this.isClosed = true;
    }
}
