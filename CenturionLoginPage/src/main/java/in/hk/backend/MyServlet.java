package in.hk.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/centurionlogin")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");  // Set the response content type
        PrintWriter out = resp.getWriter();
        
        String myname = req.getParameter("fullname");
        String mymail = req.getParameter("email");
        String myphone = req.getParameter("phone");
        String mycourse = req.getParameter("major");
        String information = req.getParameter("message");
        
        out.println("<html><body>");
        out.println("<h1>Login Details</h1>");
        out.println("<p>Name: " + myname + "</p>");
        out.println("<p>Email: " + mymail + "</p>");
        out.println("<p>Phone: " + myphone + "</p>");
        out.println("<p>Course: " + mycourse + "</p>");
        out.println("<p>Information: " + information + "</p>");
        out.println("</body></html>");
        
        out.close();
    }
}
