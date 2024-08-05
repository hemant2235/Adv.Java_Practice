package in.hk.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		if(myemail.equals("hemant@gmail.com") && mypass.equals("hemant123")) {
			RequestDispatcher rd =req.getRequestDispatcher("/Profile.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red;'>email id and password didn't match</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
 		}
 	}
}
