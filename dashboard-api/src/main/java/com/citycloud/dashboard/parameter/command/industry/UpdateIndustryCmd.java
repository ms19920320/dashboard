package com.citycloud.dashboard.parameter.command.industry;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@ApiModel("更新产业链表，包含产业中上游，产业类型，具体产业命令")
public class UpdateIndustryCmd implements ICommand {

  private static final long serialVersionUID = -7122250192975812911L;

  /** 产业编号 */
  @ApiModelProperty(value = "产业编号", required = true)
  @NotBlank(message = "[9000,{产业编号}]")
  private String industryId;

  /** 产业名称 */
  @ApiModelProperty(value = "产业名称")
  @NotBlank(message = "[9000,{产业名称}]")
  private String name;

  /** 父级产业编号 */
  @ApiModelProperty(value = "父级产业编号")
  @NotBlank(message = "[9000,{父级产业编号}]")
  private String parentId;

  /** 层级，01-电机产业链 */
  @ApiModelProperty(value = "层级，01-电机产业链")
  @NotBlank(message = "[9000,{层级，01-电机产业链}]")
  private String hierarchy;

  /** 处于产业位置 */
  @ApiModelProperty(value = "处于产业位置")
  @NotBlank(message = "[9000,{处于产业位置}]")
  private String position;
}
