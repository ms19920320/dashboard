package com.citycloud.dashboard.interceptor;

import com.citycloud.ccuap.cache.redis.utils.RedisUtils;
import com.citycloud.ccuap.web.api.context.RequestContext;
import com.citycloud.ccuap.web.api.entity.LoginUser;
import com.citycloud.ccuap.web.api.interceptor.IRequestInterceptor;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * 权限认证拦截器
 *
 * @author 孟帅
 * @since 2022-04-06
 */
@Slf4j
@Component
public class AuthInterceptor implements IRequestInterceptor {

    @Override
    public ApiResponse<?> handle(RequestContext context, LoginUser loginUser) throws Exception {
        String servletPath = context.getRequest().getServletPath();
        if (servletPath.toLowerCase(Locale.ENGLISH).contains("/api/user/login".toLowerCase(Locale.ENGLISH))) {
            return ApiResponse.success();
        }

        String token = context.getToken();
        if (StringUtils.isEmpty(token) || !RedisUtils.exists(token)) {
            ApiResponse<Object> failed = ApiResponse.failed();
            failed.setMessage("token校验失败");
            return failed;
        }

        log.info("执行拦截器：SampleA。");
        return ApiResponse.success();
    }

    @Override
    public int getOrder() {
        return 1;
    }

}
