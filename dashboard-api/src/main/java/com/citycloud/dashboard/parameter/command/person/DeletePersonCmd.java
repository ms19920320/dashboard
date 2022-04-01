package com.citycloud.dashboard.parameter.command.person;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author guopeng
 * @since 2022-03-30
 */
@Data
@ApiModel("删除null命令")
public class DeletePersonCmd implements ICommand {

  private static final long serialVersionUID = 1546427909929745854L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private Integer id;
}
