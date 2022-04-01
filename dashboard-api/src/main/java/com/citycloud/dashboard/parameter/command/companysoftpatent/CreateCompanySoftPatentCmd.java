package com.citycloud.dashboard.parameter.command.companysoftpatent;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
@Data
@ApiModel("创建组织和专利关联表命令")
public class CreateCompanySoftPatentCmd implements ICommand {

  private static final long serialVersionUID = 8607100271633551286L;

  /** 组织ID */
  @ApiModelProperty(value = "组织ID")
  @NotBlank(message = "[9000,{组织ID}]")
  private String companyId;

  /** 专利ID */
  @ApiModelProperty(value = "专利ID")
  @NotBlank(message = "[9000,{专利ID}]")
  private String softPatentId;
}
