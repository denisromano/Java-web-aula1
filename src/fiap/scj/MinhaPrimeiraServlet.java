package fiap.scj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MinhaPrimeiraServlet extends HttpServlet {

	private static final long serialVersionUID = 2777854836961607924L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.append("<title>Aula1 - JavaWeb</title>");
		out.append("<h1> Minha primeira Servlet</h1>");
		//req.getRequestDispatcher("/sucesso").forward(req, resp);
		//req.getRequestDispatcher("/sucesso").include(req, resp);
		//resp.sendRedirect("sucesso");
		
		HttpSession session = req.getSession();
		out.append("Seu id session é " + session.getAttribute("id"));		
				
		
	}
	
	
	
	
	
	
}
