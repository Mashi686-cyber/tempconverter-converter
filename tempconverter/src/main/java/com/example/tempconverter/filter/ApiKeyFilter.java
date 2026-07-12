package com.example.tempconverter.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ApiKeyFilter implements Filter {

    private static final String API_KEY = "SUPER-SECRET-DEV-KEY-123";

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {


        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;


        String path = httpRequest.getRequestURI();


        // Allow frontend files without API key
        if (path.equals("/") ||
            path.startsWith("/index.html") ||
            path.startsWith("/style.css") ||
            path.startsWith("/script.js")) {

            chain.doFilter(request, response);
            return;
        }


        String key = httpRequest.getHeader("X-API-KEY");


        // Debug line
        System.out.println("Received API Key: " + key);


        if (API_KEY.equals(key)) {

            chain.doFilter(request, response);

        } else {

            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.getWriter()
                    .write("Invalid API Key");

        }

    }
}