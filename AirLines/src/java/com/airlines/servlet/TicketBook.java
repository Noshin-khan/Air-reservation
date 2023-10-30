
package com.airlines.servlet;

import com.airlines.connection.Passenagerdatabase;
import com.airlines.dao.PassengersDao;
import com.airlines.entity.Passengers;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.sql.Blob;
import java.sql.Date;
import java.text.SimpleDateFormat;

@MultipartConfig
public class TicketBook extends HttpServlet {
      
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TicketBook</title>");            
            out.println("</head>");
            out.println("<body>");
            String pname=request.getParameter("pname");
            int age=Integer.parseInt(request.getParameter("age"));
            String contact=request.getParameter("contact");
            String email=request.getParameter("email");
            int passport= Integer.parseInt(request.getParameter("passport"));
            String gender=request.getParameter("gender");
            String source=request.getParameter("source");
            String destination =request.getParameter("destination");
            int flight_no=Integer.parseInt(request.getParameter("flightNo"));
            String TravelClass=request.getParameter("travelClass");
            String d=request.getParameter("date");
            Part filepart=request.getPart("pic");
        
            Passengers p= new Passengers(pname,contact,email,gender,source,destination,TravelClass,d,filepart,age,passport,flight_no);
            PassengersDao pd=new PassengersDao();
           if( pd.savePasseneger(p))
           {
               out.print("<h1> Succesfull </h1>");
           }
           else
           {
               out.print("<h1> Unsucessful</h1>");
           }
          
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   

}
