package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion= request.getParameter("ocupacion");
        String musica[]=request.getParameterValues("musica");
        String comentarios=request.getParameter("comentarios");
        
        out.print("<html><head><title>Resultado Servlet</title></head><body><h1>Parametros procesados por el servlet</h1><table border='1'>");
        
        out.print("<tr><td>Usuario</td><td>"+usuario+"</td></tr>");
        out.print("<tr><td>Password</td><td>"+password+"</td></tr>");
        out.print("<tr><td>tecnologias</td><td>");
        for(String tecnologia: tecnologias){
            out.print(tecnologia+" / ");
        }
        out.print("</td></tr>");
        out.print("<tr><td>Genero</td><td>"+genero+"</td></tr>");
        out.print("<tr><td>Ocupacion</td><td>"+ocupacion+"</td></tr>");
        out.print("<tr><td>tecnologias</td><td>");
        if(musica != null){
            for(String music: musica){
                out.print(music+" / ");
            }
        }
        else{
            out.print("musica favorita no seleccionada");
        }
        
        out.print("</td></tr>");
        out.print("<tr><td>comentarios</td><td>"+comentarios+"</td></tr>");
        
        
        out.print("</table></body></html>");
    }
}
