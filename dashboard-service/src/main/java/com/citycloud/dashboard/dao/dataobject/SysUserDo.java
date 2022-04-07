package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author huxx
 * @date 2022-04-06
 */
@Data
@TableName("sys_user")
public class SysUserDo {

  /** 用户所属用户组 */
  private Long groupId;

  /** 部门ID */
  private Long deptId;

  /** .. */
  private Integer type;

  /** .. */
  private Integer userGrade;

  /** 用户名 */
  private String username;

  /** 密码 */
  private String password;

  /** 用户编号 */
  private String userNo;

  /** 密码描述 */
  private String desPassword;

  /** 是否启用密码 */
  private Integer enabled;

  /** 邮箱 */
  private String email;

  /** 扩展 */
  private String extend;
}
