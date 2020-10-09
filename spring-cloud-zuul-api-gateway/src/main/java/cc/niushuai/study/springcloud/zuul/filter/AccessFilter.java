package cc.niushuai.study.springcloud.zuul.filter;

import cc.niushuai.springcloud.api.common.entity.Result;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ns
 * @date 2020/10/9
 */
@Slf4j
public class AccessFilter extends ZuulFilter {

    /**
     * 过滤器的执行类型
     *
     * @param
     * @return java.lang.String
     *
     * @author ns
     * @date 2020/10/9 11:03
     **/
    @Override
    public String filterType() {
        // 访问前请求过滤
        return "pre";
    }

    /**
     * 过滤器执行顺序
     *
     * @param
     * @return int
     *
     * @author ns
     * @date 2020/10/9 11:03
     **/
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器是否要被执行
     *
     * @param
     * @return boolean
     *
     * @author ns
     * @date 2020/10/9 11:03
     **/
    @Override
    public boolean shouldFilter() {

        return true;
    }

    /**
     * 过滤器的具体业务逻辑
     *
     * @param
     * @return java.lang.Object
     *
     * @author ns
     * @date 2020/10/9 11:04
     **/
    @Override
    public Object run() throws ZuulException {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        log.info("method: {}, requestURL: {}", request.getMethod(), request.getRequestURL().toString());

        String token = request.getParameter("token");
        if (StrUtil.isEmpty(token)) {
            log.warn("token is null");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseGZipped(true);
            currentContext.setResponseBody(JSONUtil.toJsonStr(Result.error("token is null")));
            currentContext.setResponseStatusCode(401);
            return null;
        }

        log.info("token is ok");

        return null;
    }
}
