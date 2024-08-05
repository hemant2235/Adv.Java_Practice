package in.hk.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail =(String)req.getParameter("name1");
		String mypass=(String)req.getParameter("pass1");
		
		if(myemail.equals("hemant@gmail.com") && mypass.equals("hemant@123")) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Failed");
		}
	}
}
