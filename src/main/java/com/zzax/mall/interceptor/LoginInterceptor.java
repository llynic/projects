package com.zzax.mall.interceptor;

import com.zzax.mall.domain.User;
import com.zzax.mall.util.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:07 星期五
 */

public class LoginInterceptor implements HandlerInterceptor{
    public static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*String requestURI = request.getRequestURI();
        User user = SessionUtil.getUserInSession();
        if ((requestURI.contains("/receipt") || requestURI.contains("/order") ||requestURI.contains("/shop") ) && null == user) {
            logger.info("这里?");
            response.sendRedirect("/home");
            return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
