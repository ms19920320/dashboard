package com.citycloud.dashboard.viewobject.industry;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@ApiModel("industry")
public class IndustryVo implements Serializable {

  @ApiModelProperty(value = "产业编号")
  private String industryId;

  @ApiModelProperty(value = "产业名称")
  private String name;

  @ApiModelProperty(value = "父级产业编号")
  private String parentId;

  @ApiModelProperty(value = "层级，01-电机产业链")
  private String hierarchy;

  @ApiModelProperty(value = "处于产业位置")
  private String position;
}
