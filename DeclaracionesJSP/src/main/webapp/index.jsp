<%-- Agregamos una declaracion de JSP --%>
<%! 
//DEfinicion de la clase
//Declaramos una variable con su metodo get
private String usuario= "Alberto";
public String getUsuario(){
    return this.usuario;
}
//Declaramos un contador de visitas
private int contadorVisitas=1;

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones con JSPs</title>
    </head>
    <body>
        <h1>Uso de Declaraciones con JSPs</h1>
        Valor usuario por medio del atributo: <%= this.usuario %>
        VAlor usuario por medio del metodo: <%= this.getUsuario() %>
        Contador de Visitas: <%= this.contadorVisitas++%>
    </body>
</html>
