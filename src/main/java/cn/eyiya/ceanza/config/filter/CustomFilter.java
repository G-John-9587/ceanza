package cn.eyiya.ceanza.config.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author G
 * @date 2019/11/14 13:43
 */
//@WebFilter(filterName = "customFilter", urlPatterns = {"/*"}) //用注册方式就不需要此注解
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前");
        //这里可以对request、response进行一些预处理，比如设置请求编码
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");

        //链路 直接传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);

        log.info("customFilter 请求处理之后");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("customFilter 初始化");
    }

    @Override
    public void destroy() {
        log.info("customFilter 销毁");
    }
}
