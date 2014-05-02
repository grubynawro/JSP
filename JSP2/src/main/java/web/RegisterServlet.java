package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test", "root", "agatka17");
			
			PreparedStatement ps = con.prepareStatement
					("insert into user values(?,?,?)");
			ps.setString(1, email);
			ps.setString(2, pass);
			ps.setString(3, null);
			int i=ps.executeUpdate();
			if(i>0){
				out.println("Jestes juz zarejestrowany");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}

}
