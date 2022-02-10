package com.jetty.servlets;

import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayTextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setStatus(HttpStatus.OK_200);
        PrintWriter out = response.getWriter();
        out.println("<h1> Welcome to 1st Maven Project using Jetty server </h1>");
        out.println("<h2> DisplayTextServlet </h2>");
    }

}
