package com.zzax.mall.configuration;

import com.zzax.mall.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:05 星期五
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {


    @Bean
    LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("/login/login");
        //registry.addViewController("/receipts").setViewName("/receiptPages/my_receipts_list");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/error")
                .excludePathPatterns("/home")
                .excludePathPatterns("/login");
    }
}
