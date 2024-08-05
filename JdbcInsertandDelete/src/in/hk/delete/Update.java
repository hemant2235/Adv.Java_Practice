package in.hk.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String ph_no="7894816354";
		String name = "Akash";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase", "root", "Hemant@123");
		PreparedStatement ps = con.prepareStatement("update info set ph_no=? where Name=?");
		
		ps.setString(1, ph_no);
		ps.setString(2, name);
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("Update Sucessfully");
		}
		else {
			System.out.println("Updation failed");
		}
		
	}

}
