
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        
        List<String> articulos = (List<String>)sesion.getAttribute("articulos");
        
        if (articulos==null){
            articulos=new ArrayList();
            sesion.setAttribute("articulos", articulos);
        }
        
        String articuloNuevo= request.getParameter("articulo");
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }
        
        try (
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br/>");
            for (String articulo:articulos){
                out.print("<li>"+articulo+"</li>");
            }
            
            out.print("<br/>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al Inicio</a>");
        }
    }
}
