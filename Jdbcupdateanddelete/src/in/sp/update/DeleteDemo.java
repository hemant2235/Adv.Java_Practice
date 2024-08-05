package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args)  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String email1 = "kamal@gmail.com";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Hemant@123");
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		
		ps.setString(1, email1);
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("Delete Sucessfully");
		}
		else {
			System.out.println("Deletion Failed");
		}
		
		con.close();
	}
}
