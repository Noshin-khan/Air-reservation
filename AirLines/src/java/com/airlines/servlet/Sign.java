package com.airlines.servlet;

import com.airlines.dao.UserDao;
import com.airlines.entity.User;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Sign extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Sign</title>");            
            out.println("</head>");
            out.println("<body>");
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            RequestDispatcher rd;
            User u=new User(name,email,password);
            UserDao ud=new UserDao();
            if(ud.saveUser(u))
            {
                rd=request.getRequestDispatcher("Login.html");
                rd.forward(request, response);
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

  

}
