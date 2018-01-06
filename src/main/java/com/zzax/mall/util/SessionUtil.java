package com.zzax.mall.util;

import com.zzax.mall.domain.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * @Description session工具类
 * @Created By : wangzhenjia
 * @DATE 2018-01-06 14:32 星期六
 */
public class SessionUtil {
    public static final String USER_IN_SESSION = "user";

    private static HttpSession getSession() {
        ServletRequestAttributes servletRequestAttribute = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpSession session = servletRequestAttribute.getRequest().getSession();
        return session;
    }

    /**
     * 登录成功之后放入session中
     * @param user
     */
    public static void setUserInSession(User user){
        HttpSession session = SessionUtil.getSession();
        session.setAttribute(USER_IN_SESSION, user);
    }

    /**
     * 获取session中当前登录的用户
     * @return
     */
    public static User getUserInSession(){
        HttpSession session = SessionUtil.getSession();
        return (User) session.getAttribute(USER_IN_SESSION);
    }

}
