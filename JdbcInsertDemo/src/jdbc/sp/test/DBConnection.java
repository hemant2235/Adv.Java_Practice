package jdbc.sp.test;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try {
            String name = "sritam";
            String age = "22";

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sritam", "root", "s1r2i3t4a5m");

            // Prepare SQL insert statement
            PreparedStatement ps = con.prepareStatement("INSERT INTO data (name, age) VALUES (?, ?)");
            ps.setString(1, name);
            ps.setString(2, age);

            // Execute the insert statement
            ps.executeUpdate();

            System.out.println("Insert success");

            // Close resources
            ps.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
