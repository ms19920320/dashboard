package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.CommandMapping;
import com.citycloud.ccuap.web.api.annotation.ResubmitCheck;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.SysUserApi;
import com.citycloud.dashboard.parameter.command.sysuser.SysUserLoginCmd;
import com.citycloud.dashboard.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author chen.qianfan 2021.10.12 19:39
 */
@ApiController(path = "/user")
public class SysUserApiImpl implements SysUserApi {

    @Autowired
    private SysUserService userService;

    @ResubmitCheck(enable = false)
    @CommandMapping("/login")
    @Override
    public ApiResponse<String> login(SysUserLoginCmd cmd) {
        return userService.login(cmd);
    }

    @ResubmitCheck(enable = false)
    @CommandMapping("/logout")
    @Override
    public ApiResponse<String> logout() {
        return userService.logout();
    }

}
