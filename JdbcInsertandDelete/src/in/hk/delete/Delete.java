package in.hk.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String email = "pandaakash321@gmail.com";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase", "root", "Hemant@123");
		PreparedStatement ps = con.prepareStatement("delete from info where gmail=?");
		
		ps.setString(1,email);
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("Deletion Sucessfull");
		}
		else {
			System.out.println("Deletion Failed");
		}
	}
}
