package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html><head><title>Headers HTTP</title></head><body><h1>Headers HTTP</h1></br> Metodo Http: "+metodoHttp);
        
        String uri= request.getRequestURI();
        out.print("<br>Metodo Https: "+uri+"</br></br>");
        
        Enumeration cabeceros= request.getHeaderNames();
        while(cabeceros.hasMoreElements()){
            //String nombreCabecero = cabeceros.nextElement().toString();
            String nombreCabecero = (String)cabeceros.nextElement();
            out.print("<b>"+nombreCabecero+"</b>="+request.getHeader(nombreCabecero)+"</br>");
        }
        
        out.print("</body></html>");
        out.close();
    }
}
