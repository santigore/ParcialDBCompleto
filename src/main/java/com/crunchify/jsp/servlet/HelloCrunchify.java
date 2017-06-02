package com.crunchify.jsp.servlet;
 
import edu.co.sergio.mundo.dao.AlimentoDAO;
import edu.co.sergio.mundo.vo.Alimento;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;
 
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        //Se debe incluir validaciones - Lo recuerda: Gestion de Excepciones.
        AlimentoDAO dao = new AlimentoDAO();
        
        Alimento obra = new Alimento();
        
        //Listando la informacion  
        List<Alimento> obras =  dao.findAll();
        request.setAttribute("obras", obras);
       
       
        //Redireccionando la informacion
        RequestDispatcher redireccion = request.getRequestDispatcher("index.jsp");
        redireccion.forward(request, response);
        
        
        }
}
