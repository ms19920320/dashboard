package com.citycloud.dashboard.parameter.command.sysuser;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 用户权限认证cmd
 *
 * @author 孟帅
 * @since 2022/04/06
 */
@Data
@ApiModel("用户登录命令")
public class SysUserLoginCmd implements ICommand {
    private static final long serialVersionUID = -1527130798080438484L;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "[9000,{用户名}]")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "[9000,{密码}]")
    private String password;
}
