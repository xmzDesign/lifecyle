package com.hdkj.lifecyle.configuratiopn;

import com.hdkj.lifecyle.interceptor.MyHandlerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Xu.MinZhe
 * @version V1.0
 * @Project lifecyle
 * @Package com.hdkj.lifecyle.configuratiopn
 * @Description
 * WebMvcConfigurerAdapter已经过时
 * @Date 2018/8/28 15:39
 */
@Component
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor());
    }
}
