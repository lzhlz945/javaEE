package com.zhang.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mvc.interceptor
 * @date:2021/1/20
 */
public class FirstInterseptor implements HandlerInterceptor {

    //调用之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        String user = (String) session.getAttribute("aa");
        System.out.println(1.1);
        if(1!=1){
//            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/testSession");
            httpServletRequest.getRequestDispatcher("/testSession").forward(httpServletRequest,httpServletResponse);
            return false;
        }
        return true;
    }

    //调用之后：渲染视图之前
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(1.2);
    }

    //关闭资源
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        System.out.println(1.3);
    }
}
