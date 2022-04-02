package com.citycloud.dashboard.parameter.command.industrypark;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 孟帅
 * @since 2022-04-01
 */
@Data
@ApiModel("删除产业园命令")
public class DeleteIndustryParkCmd implements ICommand {

  private static final long serialVersionUID = -3387600302490928381L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private String id;
}
