package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        int contador=0;
        
        Cookie[] cookies= request.getCookies();
        if (cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador=Integer.parseInt(c.getValue());
                }
            }
        }
        
        contador++;
        
        
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));
        
        c.setMaxAge(3600);
        response.addCookie(c);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= response.getWriter();
        out.print("Contador visitas de cada cliente: "+contador);
        out.close();
    }
}
