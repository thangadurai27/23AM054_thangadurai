package com.eventlogistics.config;

public class AppConfig {

    // You can define configurations for database, application settings, etc.

    public static final String DB_URL = "jdbc:mysql://localhost:3306/logistics_management";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "1234";

    public static void initializeApp() {
        // Initialize any app configurations
        System.out.println("App Initialized with DB URL: " + DB_URL);
    }
}
