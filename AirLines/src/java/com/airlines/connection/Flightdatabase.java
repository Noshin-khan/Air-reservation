package com.airlines.connection;
import java.sql.*;


public class Flightdatabase {
    private static Connection c;
    public static Connection getConnection() 
    {
        String url="jdbc:mysql://localhost:3306/flight";
        String username="root";
        String password="Harsh2604";
        if(c==null)
        {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           c= DriverManager.getConnection(url,username,password);
        } 
        catch (Exception e) {
            e.printStackTrace();
           
        } 
        }
        return c;
    }
    
}
