package com.citycloud.dashboard.parameter.command.sysuser;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author huxx
 * @date 2022-04-06
 */
@Data
@ApiModel("更新null命令")
public class UpdateSysUserCmd implements ICommand {

  private static final long serialVersionUID = -5215708696015877033L;

  /** 用户所属用户组 */
  @ApiModelProperty(value = "用户所属用户组")
  @NotNull(message = "[9000,{用户所属用户组}]")
  private Long groupId;

  /** 部门ID */
  @ApiModelProperty(value = "部门ID")
  @NotNull(message = "[9000,{部门ID}]")
  private Long deptId;

  /** .. */
  @ApiModelProperty(value = "..")
  @NotNull(message = "[9000,{..}]")
  private Integer type;

  /** .. */
  @ApiModelProperty(value = "..")
  @NotNull(message = "[9000,{..}]")
  private Integer userGrade;

  /** 用户名 */
  @ApiModelProperty(value = "用户名")
  @NotBlank(message = "[9000,{用户名}]")
  private String username;

  /** 密码 */
  @ApiModelProperty(value = "密码")
  @NotBlank(message = "[9000,{密码}]")
  private String password;

  /** 用户编号 */
  @ApiModelProperty(value = "用户编号")
  @NotBlank(message = "[9000,{用户编号}]")
  private String userNo;

  /** 密码描述 */
  @ApiModelProperty(value = "密码描述")
  @NotBlank(message = "[9000,{密码描述}]")
  private String desPassword;

  /** 是否启用密码 */
  @ApiModelProperty(value = "是否启用密码")
  @NotNull(message = "[9000,{是否启用密码}]")
  private Integer enabled;

  /** 邮箱 */
  @ApiModelProperty(value = "邮箱")
  @NotBlank(message = "[9000,{邮箱}]")
  private String email;

  /** 扩展 */
  @ApiModelProperty(value = "扩展")
  @NotBlank(message = "[9000,{扩展}]")
  private String extend;
}
