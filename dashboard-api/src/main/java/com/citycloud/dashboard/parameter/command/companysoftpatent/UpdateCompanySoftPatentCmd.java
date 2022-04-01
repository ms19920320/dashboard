package com.citycloud.dashboard.parameter.command.companysoftpatent;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@ApiModel("更新组织和专利关联表命令")
public class UpdateCompanySoftPatentCmd implements ICommand {

  private static final long serialVersionUID = 5288672089132771835L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private Integer id;

  /** 组织ID */
  @ApiModelProperty(value = "组织ID")
  @NotBlank(message = "[9000,{组织ID}]")
  private String companyId;

  /** 专利ID */
  @ApiModelProperty(value = "专利ID")
  @NotBlank(message = "[9000,{专利ID}]")
  private String softPatentId;
}
