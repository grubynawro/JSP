package domain;

import java.sql.*;
public class Validate {

	public static boolean checkUser(String email, String pass){
		boolean st = false;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test", "root", "agatka17");
			PreparedStatement ps = con.prepareStatement
					("select * from user where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs =ps.executeQuery();
			st = rs.next();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
}
