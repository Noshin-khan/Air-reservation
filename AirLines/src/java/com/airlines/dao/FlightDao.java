
package com.airlines.dao;
import com.airlines.connection.Flightdatabase;
import com.airlines.entity.Flight;
import java.sql.*;


public class FlightDao {
    private Connection con=Flightdatabase.getConnection();
    public  boolean state=false; 

    public FlightDao() {
    }

    public void getflight(Flight f,String source,String destination){
       
        try
        {
            String query="select * from time_table where arrival_stop= ? and destination_stop= ?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,source);
            ps.setString(2,destination);
            ResultSet rs= ps.executeQuery();
            System.out.println("Dao executed");
            
              while(rs.next())
              {
                  
                  f.setFlight_no(rs.getInt(1));
                  System.out.println(rs.getInt(1));
                  f.setArrival_stop(rs.getString(2));
                  f.setArrival_time(rs.getTime(3));
                  f.setDestination_stop(rs.getString(4));
                  f.setDestination_time(rs.getTime(5));
                  state=true;
                 
                
              }  
               
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
        
        
    }

   
    
}
