package com.citycloud.dashboard.parameter.command.industrypark;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
@Data
@ApiModel("更新产业园命令")
public class UpdateIndustryParkCmd implements ICommand {

  private static final long serialVersionUID = 5744100354117806443L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private Integer id;

  /** 名称 */
  @ApiModelProperty(value = "名称")
  @NotBlank(message = "[9000,{名称}]")
  private String name;

  /** 省 */
  @ApiModelProperty(value = "省")
  @NotBlank(message = "[9000,{省}]")
  private String province;

  /** 市 */
  @ApiModelProperty(value = "市")
  @NotBlank(message = "[9000,{市}]")
  private String city;

  /** 区/县 */
  @ApiModelProperty(value = "区/县")
  @NotBlank(message = "[9000,{区/县}]")
  private String area;
}
