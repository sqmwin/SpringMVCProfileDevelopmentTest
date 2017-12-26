package com.sqm.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //return new ModelAndView("welcome");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("q", "view");
        //modelAndView.setViewName("welcomeView");
        modelAndView.setViewName("view");
        return modelAndView;
    }
}
