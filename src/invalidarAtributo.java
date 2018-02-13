

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class invalidarAtributo
 */
@WebServlet("/invalidar")
public class invalidarAtributo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public invalidarAtributo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession sesion = request.getSession();
		sesion.invalidate();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<meta charset='UTF-8'>");
    	out.println("<title>Sesiones</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<h1>Sesión Eliminada</h1>");
    	
    	out.println("</body>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
