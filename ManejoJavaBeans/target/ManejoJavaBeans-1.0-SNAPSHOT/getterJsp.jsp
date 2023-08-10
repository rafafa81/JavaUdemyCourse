<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp que lee los valores del javabean</title>
    </head>
    <body>
        <h1>Jsp que lee los valores del javabean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <br/>
        Valor base: <jsp:getProperty name="rectangulo" property="base" />
        <br/>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura" />
        <br/>
        Valor area: <jsp:getProperty name="rectangulo" property="area" />
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
