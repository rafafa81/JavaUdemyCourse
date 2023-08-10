package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        boolean nuevoUsuario = true;
        
        //Obtenermos el arreglo de cookies
        Cookie[] cookies= request.getCookies();
        if (cookies != null){
            for (Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario=false;
                    break;
                }
            }
        }
        String mensaje="";
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteCookie);
            mensaje="Gracias por visitar nuestro sitio por primeta vez";
        }
        else{
            mensaje="Gracias por visitar nuevamente nuestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: "+mensaje);
        out.close();
    }
}
