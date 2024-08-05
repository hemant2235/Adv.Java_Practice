package lms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("Hemant".equals(username) && "Hemant@123".equals(password)) {
            request.setAttribute("message", "Hello " + username);
        } else {
            request.setAttribute("message", "Invalid credentials");
        }

        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
