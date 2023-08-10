package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String usuarioOK = "Juan";
        String passwordOK = "123";
        
        String usuario = request.getParameter("usuario");
        String password=request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOK.equals(usuario) && passwordOK.equals(password)){
            out.print("<h1>Datos correctos</br>Usuario: "+usuario+"</br>Password: "+password+"</h1>");
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
}