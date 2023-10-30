
package com.airlines.dao;
import com.airlines.connection.Passenagerdatabase;
import java.sql.*;
import com.airlines.entity.Passengers;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;



public class PassengersDao {
    private Connection con=Passenagerdatabase.getConnection();
    private boolean status=false;
 
    public boolean savePasseneger(Passengers p)
    {
        String query="insert into record values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(query);
        //    FileInputStream fis=new FileInputStream(new File(p.getPic()));
            ps.setString(1, p.getPname());
            ps.setInt(2, p.getAge());
            ps.setString(3, p.getContact());
            ps.setString(4,p.getEmail());
            ps.setInt(5,p.getPassport());
            ps.setString(6, p.getGender());
            ps.setString(7, p.getSource());
            ps.setString(8,p.getDestination());
            ps.setInt(9, p.getFlight_no());
            ps.setString(10, p.getTravel_class());
            ps.setString(11, p.getTravelDate());
            String filename=p.getPic().getSubmittedFileName();
            InputStream fileContent=p.getPic().getInputStream();
            byte[] bytes=new byte[(int) p.getPic().getSize()];
            fileContent.read(bytes);
            ps.setBytes(12, bytes);
            ps.executeUpdate(); 
            ps.close();
            con.close();
            status=true;
  
        } catch (Exception e) {
           e.printStackTrace();
        }
    
        return status;
    }
    
    
}
