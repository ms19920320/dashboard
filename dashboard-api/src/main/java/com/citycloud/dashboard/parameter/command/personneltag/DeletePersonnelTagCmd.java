package com.citycloud.dashboard.parameter.command.personneltag;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("删除人才tag关联表命令")
public class DeletePersonnelTagCmd implements ICommand {

  private static final long serialVersionUID = 263979209388491561L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private Integer id;
}
