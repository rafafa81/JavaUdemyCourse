<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con scriplets</title>
    </head>
    <body>
        <h1>JSP con scriplets</h1>
        <br/>
        <%-- scriplet para enviar informacion al navegador--%>
        <% 
            out.print("saludos desde un scriplet");
            
        %>
        <%-- scriplet para manupular objetos implicitos--%>
        <% 
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion: "+nombreAplicacion);
        %>
        <br/>
        <%-- scriplet con codigo condicionado--%>
        <% 
            if(session != null && session.isNew()){
        %>
        <%-- esto no es recomendable pero puede que lo encontremos --%>
        la session es nueva
        <% 
            } else if (session != null){
        %>
        la session no es nnueva
        <% 
            }
        %>
        <a href="index.html">Inicio</a>
    </body>
</html>
