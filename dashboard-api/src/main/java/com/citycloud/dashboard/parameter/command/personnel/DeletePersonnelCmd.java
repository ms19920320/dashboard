package com.citycloud.dashboard.parameter.command.personnel;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("删除人才表，包含人才信息命令")
public class DeletePersonnelCmd implements ICommand {

  private static final long serialVersionUID = 3595905656036127080L;

  /** 人才编号 */
  @ApiModelProperty(value = "人才编号", required = true)
  @NotBlank(message = "[9000,{人才编号}]")
  private String personnelId;
}
