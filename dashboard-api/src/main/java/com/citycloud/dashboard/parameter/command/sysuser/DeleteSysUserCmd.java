package com.citycloud.dashboard.parameter.command.sysuser;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author huxx
 * @date 2022-04-06
 */
@Data
@ApiModel("删除null命令")
public class DeleteSysUserCmd implements ICommand {

  private static final long serialVersionUID = 1349577150111720049L;
}
