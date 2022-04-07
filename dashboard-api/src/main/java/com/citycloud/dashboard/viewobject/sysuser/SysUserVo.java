package com.citycloud.dashboard.viewobject.sysuser;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author huxx
 * @date 2022-04-06
 */
@Data
@ApiModel("sys_user")
public class SysUserVo implements Serializable {

  @ApiModelProperty(value = "用户所属用户组")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long groupId;

  @ApiModelProperty(value = "部门ID")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long deptId;

  @ApiModelProperty(value = "..")
  private Integer type;

  @ApiModelProperty(value = "..")
  private Integer userGrade;

  @ApiModelProperty(value = "用户名")
  private String username;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "用户编号")
  private String userNo;

  @ApiModelProperty(value = "密码描述")
  private String desPassword;

  @ApiModelProperty(value = "是否启用密码")
  private Integer enabled;

  @ApiModelProperty(value = "邮箱")
  private String email;

  @ApiModelProperty(value = "扩展")
  private String extend;
}
