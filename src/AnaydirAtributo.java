

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/anyadir")
public class AnaydirAtributo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AnaydirAtributo() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//recuperamos los atributos que nos manda el formulario
		String atributo = request.getParameter("atributo");
		
		String valor = request.getParameter("valor");
		
	
		// Recuperamos la sesion del usuario
		HttpSession sesion = request.getSession(); 
		
		//Añadimos a la sesion la informacion del formulario
		sesion.setAttribute(atributo, valor);
		
		//salida del servelet para el usuario.
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<meta charset='UTF-8'>");
    	out.println("<title>Sesiones</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<h1>Sesión del usuario</h1>");
    	
    	Enumeration<String> nombresDeAtributos = sesion.getAttributeNames();
    	
    	while (nombresDeAtributos.hasMoreElements()) {
			
    		
    		atributo = nombresDeAtributos.nextElement();
			valor = (String) sesion.getAttribute(atributo);

			out.println("<hr>");
			
	    	out.println("<p>Atributo: "+ atributo+"</p>");
	    	
	    	out.println("<p>Valor: "+ valor+"</p>");
	    	
			
		}
    	
    	out.println("</body>");
    	
    	
    	
    	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
