<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con expresiones</title>
    </head>
    <body>
        <h1>JSP con expresiones</h1>
        Concatenacion: <%= "Saludos"+""+"JSP" %>
        <br/>
        Operacion matematica <%= 2 * 3 / 2 %>
        <br/>
        Session id: <%= session.getId() %>
        <br/>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
