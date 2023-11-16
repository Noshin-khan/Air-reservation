package com.airlines.dao;
import com.airlines.connection.Userdatabase;
import com.airlines.entity.User;
import java.sql.*;



public class UserDao {
    
    //Get Connection 
   private Connection con=Userdatabase.getConnection();
   private boolean status=false;
   private PreparedStatement ps;
   
   //save  user into database;
   public boolean saveUser(User u)
   {
       //Insert into database 
       String query="insert into login_Detail(name,email,password) values(?,?,?)";
       try
       {
            ps=con.prepareStatement(query);
            ps.setString(1,u.getName());
            ps.setString(2,u.getEmail());
            ps.setString(3, u.getPassword());
            ps.executeUpdate();
            ps.close();
            status=true;
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       
      return status;
   }
   
   
  
  
    
    
}
