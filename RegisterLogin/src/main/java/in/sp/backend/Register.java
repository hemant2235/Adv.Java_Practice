package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		
		String myName= request.getParameter("name1");
		String myEmail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		String mygender = request.getParameter("gender1");
		String mycity = request.getParameter("ccity1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logi_jd","root","Hemant@123");
			
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, myName);
			ps.setString(2, myEmail);
			ps.setString(3, mypass);
			ps.setString(4, mygender);
			ps.setString(5, mycity);
			
			int count = ps.executeUpdate();
			
			if(count>0) {
				response.setContentType("/text.html");
				out.print("<h3 style='color:green'>User registerd sucessfully</h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
				rd.include(request, response);
			}
			else {
				response.setContentType("/text.html");
				out.print("<h3 style='color:red'>User not registerd due to some error</h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
				rd.include(request, response);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
			response.setContentType("/text.html");
			out.print("<h3 style='color:red'>Exception occured: "+e.getMessage()+"</h3>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
			rd.include(request, response);
		}
	}
}
