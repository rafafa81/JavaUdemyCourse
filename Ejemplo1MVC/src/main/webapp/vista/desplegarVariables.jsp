<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1>
        Variable en alcance request: ${mensaje}
        <br/>
        Variable en alcance de sesion: 
        <br/>
        Recatangulo: 
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresasr al index</a>
    </body>
</html>
