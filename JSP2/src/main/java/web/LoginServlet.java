package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Validate;

import java.sql.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html);charst=UTF-8");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(Validate.checkUser(email,pass)){
			ServletContext ctx = this.getServletContext();
			RequestDispatcher dispatcher = ctx.getRequestDispatcher("/home.jsp");
			RequestDispatcher rs = request.getRequestDispatcher("welcome");
			dispatcher.forward(request, response);
			rs.forward(request,  response);
			
		}
		else
		{
			out.println("Dane logowania sa nieprawidlowe");
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.forward(request, response);
		}
	}

}
