
package com.airlines.connection;
import java.sql.*;


public class Passenagerdatabase {
    private  static Connection con;
    public static Connection getConnection()
    {
         String url="jdbc:mysql://localhost:3306/passengers";
         String username="root";
         String password="Harsh2604";
        if(con==null)
        {
             try {
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection(url,username,password);
          
        } catch (Exception e) {
           e.printStackTrace();
        }
        }
       
          return con;
    }
    
}
