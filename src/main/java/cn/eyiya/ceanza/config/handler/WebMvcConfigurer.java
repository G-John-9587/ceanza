package cn.eyiya.ceanza.config.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author G
 * @date 2019/11/14 17:10
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册多个拦截器 拦截规则
        //多个拦截器时 在这里添加 执行顺序按添加顺序执行
        registry.addInterceptor(getHandlerInterceptor()).addPathPatterns("/*");
    }


    @Bean
    public static HandlerInterceptor getHandlerInterceptor(){
        return new CustomHandlerInterceptor();
    }
}
