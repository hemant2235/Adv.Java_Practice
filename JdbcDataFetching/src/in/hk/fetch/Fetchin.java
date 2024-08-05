package in.hk.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

public class Fetchin {
		public static void main(String[] args) throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase", "root", "Hemant@123");
			
			PreparedStatement ps = con.prepareStatement("select * from info");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String name1 = rs.getString("Name");
				System.out.println("Name:- "+name1);
				
				String email1 = rs.getString("gmail");
				System.out.println("Email:- "+email1);
				
				String ph_no = rs.getString("ph_no");
				System.out.println("Password:- "+ph_no);
				
				System.out.println("<--------------------------------------------------------------->");
			}
		}
}
