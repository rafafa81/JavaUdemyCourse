<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance variables </title>
    </head>
    <body>
        <h1>Alcance variables </h1>
        <br/>
        Variable request: 
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br/>
        Variable sesion: 
        Base: ${rectanguloSesion.base}
        Altura: ${rectanguloSesion.altura}
        Area: ${rectanguloSesion.area}
        <br/>
        Variable aplicacion: 
        Base: ${rectanguloAplicacion.base}
        Altura: ${rectanguloAplicacion.altura}
        Area: ${rectanguloAplicacion.area}
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
        
    </body>
</html>
