<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa formulario</title>
    </head>
    <body>
        <h1>Resultado de procesar el formulario</h1>
        Usuario: <%= request.getParameter("usuario")%>
        <br/>
        Password: <%= request.getParameter("password") %>
        <br/>
        <a href="index.html">Regresa a pagina inicial</a>
    </body>
</html>
