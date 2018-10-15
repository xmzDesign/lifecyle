package com.hdkj.lifecyle.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Xu.MinZhe
 * @version V1.0
 * @Project lifecyle
 * @Package com.hdkj.lifecyle.filter
 * @Description
 * @Date 2018/8/28 15:22
 */
@WebFilter(filterName = "indexFilter", urlPatterns = "/*")
public class IndexFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(IndexFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("进入filter init :{}",filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("进入filter doFilter ");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        logger.info("进入filter destroy ");

    }
}
