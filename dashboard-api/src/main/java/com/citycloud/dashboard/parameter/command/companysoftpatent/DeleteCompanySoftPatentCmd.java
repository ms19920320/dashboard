package com.citycloud.dashboard.parameter.command.companysoftpatent;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@ApiModel("删除组织和专利关联表命令")
public class DeleteCompanySoftPatentCmd implements ICommand {

  private static final long serialVersionUID = 985598967700857918L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private Integer id;
}
