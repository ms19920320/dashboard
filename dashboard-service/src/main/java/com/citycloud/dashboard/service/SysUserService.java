package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.dataobject.SysUserDo;
import com.citycloud.dashboard.parameter.command.sysuser.SysUserLoginCmd;

/**
 * @author huxx
 * @date 2022-04-06
 */
public interface SysUserService extends IService<SysUserDo> {

  ApiResponse<Object> login(SysUserLoginCmd cmd);

  ApiResponse<String> logout();

}
