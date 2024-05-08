package org.example.DesignPatterns.CreationalPattern.SingletonPattern;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private final String logFile;

    private Logger() {

        logFile = "application.log";
    }

    private static final class InstanceHolder {
        private static final Logger instance = new Logger();
    }

    public static Logger getInstance() {
        return InstanceHolder.instance;
    }

    public void writeLog(String message) {
        // Write the log message to the log file
        try (FileWriter fileWriter = new FileWriter(logFile, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
            printWriter.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
