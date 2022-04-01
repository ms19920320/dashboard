package com.citycloud.dashboard.parameter.query.industry;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@ApiModel("industry")
public class IndustryListQuery implements IQuery {

  private static final long serialVersionUID = 5287537563742841465L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

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
