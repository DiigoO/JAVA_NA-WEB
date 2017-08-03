package br.com.fiap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MinhaPrimeiraServlet extends HttpServlet{
	private static final long serialVersionUID = -8153852948177878688L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.append("<h1>Primeira servlet!</h1>");
		
		/**
		 * TODO questão 1 ou 2 da prova  
		 */
//		req.getRequestDispatcher("/sucesso").forward(req, resp);
//		req.getRequestDispatcher("/sucesso").forward(req, resp);
		resp.sendRedirect("sucesso");	
	}	
}
