package com.gotee.security.rest;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import com.gotee.security.entity.User;
import com.gotee.security.service.UserService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class AuthenticationTokenProcessingFilter extends GenericFilterBean
{
    private final UserService userService;

    public AuthenticationTokenProcessingFilter(UserService userService)
    {
        this.userService = userService;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
    {
        HttpServletRequest httpRequest = this.getAsHttpRequest(request);

        String accessToken = this.extractAccessTokenFromRequest(httpRequest);
        System.out.println(accessToken);
        if (null != accessToken) {
            User user = this.userService.findUserByAccessToken(accessToken);
            if (null != user) {
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        chain.doFilter(request, response);
    }

    private HttpServletRequest getAsHttpRequest(ServletRequest request)
    {
        if (!(request instanceof HttpServletRequest)) {
            throw new RuntimeException("Expecting an HTTP request");
        }

        return (HttpServletRequest) request;
    }

    private String extractAccessTokenFromRequest(HttpServletRequest httpRequest)
    {
        /* Get token from header */
        String authToken = httpRequest.getHeader("X-Access-Token");

		/* If token not found get it from request parameter */
        if (authToken == null) {
            authToken = httpRequest.getParameter("token");
        }

        return authToken;
    }
}
