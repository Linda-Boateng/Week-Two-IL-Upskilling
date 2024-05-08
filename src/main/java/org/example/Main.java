package org.example;

import org.example.DesignPatterns.CreationalPattern.DatabaseConnection;
import org.example.DesignPatterns.CreationalPattern.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        Logger logger = Logger.getInstance();
        logger.writeLog("This is a log message.");

    }
}