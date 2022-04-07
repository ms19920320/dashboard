package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.command.sysuser.SysUserLoginCmd;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * 用户登录验证及账户操作接口
 *
 * @author 孟帅
 * @date 2022-04-06
 */
@Api(tags = "权限操作接口")
public interface SysUserApi {
    @ApiOperation(value = "用户登录", notes = "用户登录。")
    ApiResponse<String> login(@RequestBody @Valid SysUserLoginCmd cmd);

    @ApiOperation(value = "退出登录", notes = "退出登录。")
    ApiResponse<String> logout();
}
