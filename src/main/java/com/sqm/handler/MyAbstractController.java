package com.sqm.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyAbstractController extends AbstractController {
    //此方法被AbstractController的handleReqeust()调用执行,最终被处理器映射器调用执行
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("welcome", "hello spring mvc world");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
