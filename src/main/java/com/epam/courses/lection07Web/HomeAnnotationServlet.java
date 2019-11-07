package com.epam.courses.lection07Web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/homeAnnotation", initParams = {
        @WebInitParam(name = "locale", value = "ru")
})
public class HomeAnnotationServlet extends HttpServlet {
    private static String defaultLocale;
    @Override
    public void init(ServletConfig config) throws ServletException {
        defaultLocale = config.getInitParameter("locale");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("locale", defaultLocale);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
