package in.hk.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertion {
	public static void main(String[] args) throws Exception{
		String name = "Dibya Ranjan Dash";
		String gmail = "dibyaranjan@gmail.com";
		String ph_no = "9692246057";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase", "root", "Hemant@123");
		
		
		PreparedStatement ps = con.prepareStatement("insert into info values(?,?,?)");
		ps.setString(1, name);
		ps.setString(2, gmail);
		ps.setString(3, ph_no);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Failed");
		}
	}
}
