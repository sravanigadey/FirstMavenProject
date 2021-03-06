package com.jetty;

import com.jetty.servlets.DisplayTextServlet;
import com.jetty.servlets.DisplayTextServlet1;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyServer {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8081);

        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(DisplayTextServlet.class, "/displaytext");
        handler.addServletWithMapping(DisplayTextServlet1.class, "/displaytext1");
        server.setHandler(handler);

        server.start();
        server.join();
    }
 }
