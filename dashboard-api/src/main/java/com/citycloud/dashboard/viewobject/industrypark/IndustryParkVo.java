package com.citycloud.dashboard.viewobject.industrypark;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author MoliCode
 * @since 2022-04-01
 */
@Data
@ApiModel("industry_park")
public class IndustryParkVo implements Serializable {

  @ApiModelProperty(value = "主键")
  private Integer id;

  @ApiModelProperty(value = "名称")
  private String name;

  @ApiModelProperty(value = "省")
  private String province;

  @ApiModelProperty(value = "市")
  private String city;

  @ApiModelProperty(value = "区/县")
  private String area;
}
