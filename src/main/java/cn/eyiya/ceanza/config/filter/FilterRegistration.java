package cn.eyiya.ceanza.config.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author G
 * @date 2019/11/14 13:52
 */
@Configuration
public class FilterRegistration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入
        //若无其他bean需要获取时，可直接new CustomFilter()，可以使用getBean的方式
        registration.setFilter(customFilter());
        //过滤器名称
        registration.setName("customFilter");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean anotherFilterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入
        //若无其他bean需要获取时，可直接new CustomFilter()，可以使用getBean的方式
        registration.setFilter(anotherFilter());
        //过滤器名称
        registration.setName("anotherFilter");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(2);
        return registration;
    }

    @Bean
    public Filter customFilter(){
        return new CustomFilter();
    }

    @Bean
    public Filter anotherFilter(){
        return new AnotherFilter();
    }
}
