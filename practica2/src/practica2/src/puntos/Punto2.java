package puntos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Punto2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Punto2() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html"); //Mime HTML
		PrintWriter out=response.getWriter();//objeto respuesta para manejar idem
		out.print("<html><body>");// //impresion HTML por flujo Print Writer
		
		
		Enumeration headerNames= request.getHeaderNames(); //numeracion de los encabezados de la peticion	
		out.print("PETICION TIPO<br>");
		out.print(request.getMethod());//Accesamos al tipo de peticion en la que se programo el servlet
		out.print("<br>");
		 //Mientras haya un encabezado en nuestra numeracion por el cual no hayamos pasado 
			while(headerNames.hasMoreElements()) { //hasMoreElements is boolean
				String clave =(String) headerNames.nextElement(); //Cast a cadena para la clave del encabezado  
				String valor=request.getHeader(clave);//Obtenemos el valor del encabezado con su clave
				out.println(clave+":"+valor+"<br>"); //USer-agent:Mozilla Firefox
				out.print("</body></html>");//Cerramos campo HTML
												}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
