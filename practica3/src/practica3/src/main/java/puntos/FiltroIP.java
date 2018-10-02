package puntos;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


public class FiltroIP implements Filter {

    public FiltroIP() {
    	super();
    }

	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String ip= request.getRemoteAddr();
		Date date= new Date();
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		System.out.println("Filter:"+ip+ " " + date);
		
		
		
		chain.doFilter(request, response);
	//	httpResponse.sendRedirect("/practica3");
		
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
