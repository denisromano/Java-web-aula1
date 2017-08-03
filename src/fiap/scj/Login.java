package fiap.scj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 8611399381896437949L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		PrintWriter out = resp.getWriter();
		out.append(login);
		out.append(senha);
		
	}

	
	
}
