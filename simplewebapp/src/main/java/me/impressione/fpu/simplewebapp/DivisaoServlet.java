package me.impressione.fpu.simplewebapp;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/divisao")
public class DivisaoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String xstr = req.getParameter("x");
		String ystr = req.getParameter("y");
		double x = Integer.parseInt(xstr);
		double y = Integer.parseInt(ystr);
		
		double divisao = x / y;
		
		PrintWriter writer = resp.getWriter();
		
		writer.write("O valor é " + divisao);
		
	}
}
