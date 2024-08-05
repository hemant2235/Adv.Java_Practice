package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception {
		String password1 = "depak482";
		String email1 = "deepak@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Hemant@123");
		
		PreparedStatement ps = con.prepareStatement("update register set password=? where email=?");
		ps.setString(1, password1);
		ps.setString(2, email1);
		
		int count = ps.executeUpdate();
		
		if(count > 0) {
			System.out.println("updated sucessfully");
		}
		else {
			System.out.println("updation failed");
		}
		
		con.close();
		
		
	}
}
