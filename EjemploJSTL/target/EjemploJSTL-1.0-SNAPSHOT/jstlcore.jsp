
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL core</title>
    </head>
    <body>
        <h1>JSTL core</h1>
        <!-- manipulacion de variables-->
        <c:set var="nombre" value="Ernesto" />
        Variable nombre: <c:out value="${nombre}" />
        <br/>
        VAriable con codigo html: 
        <c:out value="<h4>hola</h4>" escapeXml="false"/>
        <br/>
        <!-- codigo considicionado -->
        <c:set var="bandera" value="true" />
        <c:if test="${bandera}">
            la bandera es verdadera
        </c:if>
            
        <br/>
        <!-- condicionado switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}" >
                    <br/>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}" >
                    <br/>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise >
                    <br/>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!-- iterar un arreglo -->
        <% 
            String nombres[] = {"Claudia","predro","juan"};
            request.setAttibute("nombres",nombres);
        %>
        <br/>
        Lista de nombres:
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}" >
                <li>Nombre : ${persona}</li>
            </c:forEach>
        </ul>
    </body>
</html>
