package controlador;

import jakarta.servlet.RequestDispatcher;
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
        
        //2.- Creamos los JavaBeans
        Rectangulo rec = new Rectangulo(3,6);
        
        //3.- Agregamos el javabean a algun alcance
        request.setAttribute("mensaje","Saludos desde el Servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo",rec);
        
        //4.- Redireccionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request,response);
    }
}
