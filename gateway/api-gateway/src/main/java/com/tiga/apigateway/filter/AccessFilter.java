package com.tiga.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AccessFilter extends ZuulFilter {

     private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        //请求被路由之前执行
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

      	log.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

        /**
         * http://localhost:1101/eureka-client/dc：返回401错误码
         * http://localhost:1101/eureka-client/dc?accessToken=token：正确路由到eureka-client的/dc接口，
         */
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            log.warn("access token is empty");
            //zuul设置校验规则是访问Swagger前处理pre过滤器
            // ctx.setSendZuulResponse(false);
            // ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return null;
    }

}