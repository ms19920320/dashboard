package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.cache.redis.utils.RedisUtils;
import com.citycloud.ccuap.web.api.context.RequestContext;
import com.citycloud.ccuap.web.api.context.RequestContextHolder;
import com.citycloud.ccuap.web.api.entity.LoginUser;
import com.citycloud.ccuap.web.api.entity.SysUser;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.SysUserDao;
import com.citycloud.dashboard.dao.dataobject.SysUserDo;
import com.citycloud.dashboard.parameter.command.sysuser.SysUserLoginCmd;
import com.citycloud.dashboard.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 用户权限认证
 *
 * @author 孟帅
 * @since 2020/04/06
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserDo> implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public ApiResponse<String> login(SysUserLoginCmd cmd) {
        String username = cmd.getUsername();
        String password = cmd.getPassword();
        SysUserDo sysUserDo = sysUserDao.findUserByUsername(username);
        if (sysUserDo != null && sysUserDo.getPassword() != null && sysUserDo.getPassword().equals(password)) {
            String accessToken = UUID.randomUUID().toString();
            LoginUser loginUser = new LoginUser();
            SysUser user = new SysUser();
            user.setUserName(username);
            user.setPassword(password);
            loginUser.setUser(user);
            RedisUtils.set(accessToken, loginUser, true);
            RequestContext requestContext = RequestContextHolder.newContext();
            requestContext.setToken(accessToken);
            RequestContextHolder.setContext(requestContext);
            return ApiResponse.successWithData(accessToken);
        }
        ApiResponse apiResponse = ApiResponse.failed();
        apiResponse.setCode(401);
        apiResponse.setSuccess(true);
        return apiResponse;
    }

    @Override
    public ApiResponse<String> logout() {
        RequestContext requestContext = RequestContextHolder.getContext();
        RedisUtils.remove(requestContext.getToken(), true);
        return ApiResponse.success();
    }
}
