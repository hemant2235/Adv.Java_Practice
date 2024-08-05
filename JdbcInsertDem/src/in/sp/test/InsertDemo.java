package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		String name1 = "Hemant";
		String email1 = "hemantkumarpanda482@gmail.com@";
		String password1 = "Hemant@123";
		String gender1 = "female";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Hemant@123");
		
//		PreparedStatement ps = con.prepareStatement("insert into register values('"+name1+"', '"+email1+"', '"+password1+"', '"+gender1+"')");
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, password1);
		ps.setString(4, gender1);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Failed");
		}
		con.close();
		ps.close();
	}
}
