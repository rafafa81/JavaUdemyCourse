<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp qiue modifica a un javabean</title>
    </head>
    <body>
        <h1>Jsp qiue modifica a un javabean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        Modificamos los atributos
        <br/>
        <% 
            int baseValor= 5;
            int alturaValor=10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        
        Nuevo valor de base: <%=baseValor%>
        <br/>
        Nuevo valor de base: <%=alturaValor%>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
