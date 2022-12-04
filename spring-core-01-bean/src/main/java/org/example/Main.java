package org.example;

import services.DBConnection;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nNormal main\n\n");
        DBConnection dbConnection = new DBConnection();
        dbConnection.connectDB();
        dbConnection.disconnectDB();



    }
}