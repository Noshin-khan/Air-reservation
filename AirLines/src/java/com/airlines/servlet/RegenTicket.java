
package com.airlines.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.airlines.dao.PassengersDao;


public class RegenTicket extends HttpServlet {

   
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( 
                PrintWriter out = response.getWriter()) {
            
            //fetching ticket number 
            int ticketNumber= Integer.parseInt(request.getParameter("ticketNo"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegenTicket</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //PassengersDao object 
            PassengersDao pd=new PassengersDao();
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

  

}
