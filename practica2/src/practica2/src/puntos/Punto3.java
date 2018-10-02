package puntos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Punto3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Punto3() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer x=0; //Declaramos una variable entera en el ambito del metodo
		String str="<br>Aumentando variable X<br>"; //Cadena a concatenar cada que aumente el valor
		PrintWriter out=response.getWriter();//Instancia de objeto de flujo de respuesta
		out.print("<html><body>");//COmienza cuerpo HTML
		out.print("<h2>Variable dentro de doGet</h2>");
		out.print(x+"\n");
		x++;//Aumento de la variable en cada llamada a doGet
		out.print(str);
		str=str+str;//Concatenacion de la cadena en cada llamada a doGet
		out.print("</body></html>");//fin cuerpo HTML
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
