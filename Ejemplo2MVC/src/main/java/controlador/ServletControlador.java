package controlador;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1.- Procesamos parametros
        String accion = request.getParameter("accion");        
        
        //2.- Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSesion = new Rectangulo(3,4);
        Rectangulo recAplicacion = new Rectangulo(5,6);
        
        //3.- Agregamos el javabean a algun alcance
        
        //revisamos la accion proporcionada
        if("agregarVariables".equals(accion)){
            //alcance request
            request.setAttribute("rectanguloRequest",recRequest);
            //alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            //Alcance aplicacion
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion",recAplicacion);
            //agregamos un mensaje
            request.setAttribute("mensaje", "las variables fueron agregadas");
            //4 redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
        else if("listarVariables".equals(accion)){
            //4 redireccionamos al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }
        else {
            //4 redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            // tambien se podria utilizar, pero no se puede compartir informacion servlet a jsp
            // response.sendRedirect("index.jsp");
        }
        
    }
}
