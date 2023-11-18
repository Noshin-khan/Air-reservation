
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import= "com.airlines.entity.Flight" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Available</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </head>
    <body>
      
        <div class="container">
            <div class="card">
                <div class="card-body">
            <div class="table">
                <table>
                     <tr>
                    <th> 
                      Flight Number:
                    </th>
                    <th>
                     <c:out value="${details.flight_no}"></c:out>
                    </th>      
                    </tr>
                    <tr>
                    <th> 
                      Source 
                    </th>
                    <th>
                    Destination :
                    </th>      
                    </tr>
                     <tr>
                    <td> 
                     <c:out value="${details.arrival_stop}"></c:out>
                    </td>
                    <td>
                     <c:out value="${details.destination_stop}"></c:out>
                      <c:out value="${details.arrival_time}"></c:out>
                     
                    </td>      
                    </tr>
                    
                
                </table>
            </div>
                </div>
               
            </div>
            
        </div>
      
     
     
       
       
    </body>
</html>
