package com.zzax.mall.starter;

import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Description：编写系统启动时需要调用的方法
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 9:18 星期五
 */

@Configuration
public class MyServletContextListener implements ServletContextListener {

    //在系统启动的时候调用这个方法
    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
