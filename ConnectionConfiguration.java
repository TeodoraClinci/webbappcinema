package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {

    public static Connection getConnection(){
        Connection connection=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vrajeala", "root", "Macaroane1234");

        }
        catch (Exception e) { e.printStackTrace();}

        return connection;
    }
}
