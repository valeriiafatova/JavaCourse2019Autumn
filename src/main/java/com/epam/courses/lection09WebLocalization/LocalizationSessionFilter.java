package com.epam.courses.lection09WebLocalization;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(value = "/session",
        initParams = {@WebInitParam(name = "locale", value = "en"), @WebInitParam(name = "bundle", value = "messages")})
public class LocalizationSessionFilter implements Filter {
    public static final String LOCALE_ATTR = "locale";
    public static final String BUNDLE_ATTR = "bundle";

    private String defaultLocale;
    private String defaultBundle;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.defaultLocale = filterConfig.getInitParameter("locale");
        this.defaultBundle = filterConfig.getInitParameter("bundle");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        
        String locale = (String) session.getAttribute(LOCALE_ATTR);
        if (locale == null) {
            session.setAttribute(LOCALE_ATTR, defaultLocale);
        }

        String bundle = (String) session.getAttribute(BUNDLE_ATTR);
        if (bundle == null) {
            session.setAttribute(BUNDLE_ATTR, defaultBundle);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
