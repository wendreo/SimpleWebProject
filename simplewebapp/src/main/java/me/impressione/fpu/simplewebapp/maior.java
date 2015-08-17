package me.impressione.fpu.simplewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/maior")
public class maior extends HttpServlet {
	
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	String valorX = req.getParameter("x");
        String valorY = req.getParameter("y");
        
        PrintWriter resposta = resp.getWriter();
        
        try
        {
        	  
            
            double x = Double.parseDouble(valorX);
            double y = Double.parseDouble(valorY);
            
        	
        	if(x == y)
        	{
        		resposta.write("<font color='red'>Os valore são iguais !!</font>");
        	}
        	else if(x > y)
        	{
        		resposta.write("<font color='green'>O valor " + x + " é maior que o valor " + y +" !</font>");
        	}
        	else
        	{
        		resposta.write("<font color='blue'>O valor " + y + " é maior que o valor " + x +" !</font>");
        	}
        	
        }
        catch(NumberFormatException  e){
        	
        	PrintWriter justNumber = resp.getWriter();
        	
        	justNumber.write("<font color='red'>Digite apenas Numeros !!</font>");
        	
        }
        
    	
    	}
	} 


