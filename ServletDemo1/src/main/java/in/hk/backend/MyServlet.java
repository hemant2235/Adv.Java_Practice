package in.hk.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitForm")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myName=req.getParameter("name1");
		String myEmail = req.getParameter("email1");
		
		System.out.println("Name 1:- "+myName);
		System.out.println("Email 1:- "+myEmail);
		
		PrintWriter  out = resp.getWriter();
		out.println("Name:- "+myName);
		PrintWriter  out1 = resp.getWriter();
		out1.println("Email:- "+myEmail);
	}
}
