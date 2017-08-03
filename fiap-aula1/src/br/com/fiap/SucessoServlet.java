package br.com.fiap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sucesso")
public class SucessoServlet extends HttpServlet{
	private static final long serialVersionUID = 879943170337822657L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.append("<h1>Operação realizada com sucesso!</h1>");
		
		HttpSession session = req.getSession();
		
	}
	
}
