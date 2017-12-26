package com.sqm.handler;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyHttpRequestController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("welcome", "hello spring world");
        request.getRequestDispatcher("/web-resources/welcome.jsp").forward(request,response);
    }
}
