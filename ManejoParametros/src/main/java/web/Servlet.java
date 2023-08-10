package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros del formulario
        String usuario= request.getParameter("usuario");
        String password= request.getParameter("password");
        
        System.out.println(usuario);
        System.out.println(password);
        
        PrintWriter out = response.getWriter();
        out.print("<html><body>Usuario: "+usuario+"<br/>Password: "+password+"</body></html>");
        out.close();
    }
}
