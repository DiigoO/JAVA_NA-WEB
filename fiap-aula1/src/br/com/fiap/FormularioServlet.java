package br.com.fiap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formularioServlet")
public class FormularioServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("Name");
		String email = req.getParameter("Email");
		String message = req.getParameter("Message");
		
		try{
			BufferedWriter writer = null;
			File logFile = new File("/informacoes-"+name+".txt");
			writer = new BufferedWriter(new FileWriter(logFile));
		    writer.write("Name: " + name);
		    writer.write("\r\nE-mail: " + email);
		    writer.write("\r\nMessage: " + message);
		    writer.close();
		    resp.getWriter().append("<h1>Enviado com sucesso!</h1>");
		} catch (IOException e) {
			e.printStackTrace();
			resp.getWriter().append("<h1>Ocorreu um erro na sua requisição, tente novamente mais tarde!</h1>");
		}
		
	}

}
