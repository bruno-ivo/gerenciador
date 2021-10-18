package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -696631286880845993L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, parabens você escreveu o seu primeiro servlet.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OiMUndo foi chamado");
	}
}
