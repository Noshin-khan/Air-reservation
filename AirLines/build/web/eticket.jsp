<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import = "com.airlines.entity.Passengers" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ticket</title>
    </head>
    <body>
        <h1>Indian AirLines</h1>
        <h1> Name :  <c:out  value="${pass.pname}"/></h1>

        
    </body>
</html>
