<%-- 
    Document   : index
    Created on : 5 ago. 2023, 22:58:15
    Author     : usuario
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo JSP</title>
    </head>
    <body>
        <h1>Hola Mundo JSP</h1>
        <ul>
            <li> <% out.print("hola mundo con scriplets"); %> </li>
            <li> ${"Hola mundo con expresion language (EL)"} </li>
            <li> <%=  "HOla mundo con expresiones incluye out implicito" %> </li>
            <li> <c:out value="Hola mundo con jstl" /> </li>
        </ul>
    </body>
</html>
