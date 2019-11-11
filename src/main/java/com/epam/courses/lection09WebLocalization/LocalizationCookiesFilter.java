package com.epam.courses.lection09WebLocalization;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebFilter(value = "/cookies",
        initParams = {@WebInitParam(name = "locale", value = "en"), @WebInitParam(name = "bundle", value = "messages")})
public class LocalizationCookiesFilter implements Filter {
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
        HttpServletRequest httpServletRequest = (HttpServletRequest) request; 
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        HttpSession session = httpServletRequest.getSession();

        List<Cookie> cookies = Arrays.asList(httpServletRequest.getCookies());
        
        if (hasNotCookie(cookies, LOCALE_ATTR)) {
            httpServletResponse.addCookie(new Cookie(LOCALE_ATTR, defaultLocale));
            //optional, but could be also saved in session for easiest 'get' in jsp
            session.setAttribute(LOCALE_ATTR, defaultLocale);
        }

        //better save in session, since it is 'app' config and should not be shown to user
        if (hasNotCookie(cookies, BUNDLE_ATTR)) {
            //httpServletResponse.addCookie(new Cookie(BUNDLE_ATTR, defaultBundle));
            session.setAttribute(BUNDLE_ATTR, defaultBundle);
        }

        chain.doFilter(request, response);
    }

    private boolean hasNotCookie(List<Cookie> cookies, String name) {
        return cookies.stream().noneMatch(cookie -> name.equals(cookie.getName()));
    }

    @Override
    public void destroy() {

    }
}
