package in.hk.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("submitform")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String search = request.getParameter("search1");
		 
//		 response.sendRedirect("https://www.google.com");
		 response.sendRedirect("https://www.google.com/search?q+"+search);
	}
}
