package com.epam.courses.lection10Authorization;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    private static final Logger LOG = Logger.getLogger(LoginServlet.class);
    private static UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        
        if (userService.validateUser(login, password)) {
            HttpSession session = req.getSession(true);
            User user = userService.getUser(login);
            LOG.info("Login user: " + user);
            session.setAttribute("user", user);
            resp.sendRedirect(req.getContextPath() + "/");
        } else {
            req.setAttribute("error", "Login or password invalid!");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
