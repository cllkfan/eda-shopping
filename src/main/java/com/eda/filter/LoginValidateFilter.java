package com.eda.filter;


import com.eda.entity.Token;
import redis.clients.jedis.Jedis;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author TaoMinghui
 * @create 2021-08-30 7:39
 */
@WebFilter("/user/*")
public class LoginValidateFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse resp=(HttpServletResponse) servletResponse;

        Jedis jedis = new Jedis("8.130.172.12", 6383);
        jedis.auth("123456");
        String username = jedis.get("username");
        if(username == null){

        }else {
            filterChain.doFilter(req,resp);
        }

    }

    @Override
    public void destroy() {

    }
}
