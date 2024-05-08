package org.example;

import org.example.DesignPatterns.CreationalPattern.FactoryPattern.Shape;
import org.example.DesignPatterns.CreationalPattern.FactoryPattern.ShapeFactory;
import org.example.DesignPatterns.CreationalPattern.SingletonPattern.DatabaseConnection;
import org.example.DesignPatterns.CreationalPattern.SingletonPattern.Logger;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        Logger logger = Logger.getInstance();
        logger.writeLog("This is a log message.");


        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape square = ShapeFactory.createShape("square");
        square.draw();
    }
}