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
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		
		PrintWriter out = response.getWriter();
		
		if(myemail.equals("hemant@gmail.com") && mypass.equals("hemant@123")) {
			request.setAttribute("name_key", "Hemant Kumar");
			RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
 		}
		else {
			response.setContentType("text/html");
			out.print("<h3 style='color:red;'>Email id and password didn't matched</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
