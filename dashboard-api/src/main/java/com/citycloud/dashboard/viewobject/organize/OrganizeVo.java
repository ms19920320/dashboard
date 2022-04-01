package com.citycloud.dashboard.viewobject.organize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("organize")
public class OrganizeVo implements Serializable {

  @ApiModelProperty(value = "组织编号")
  private String organizeId;

  @ApiModelProperty(value = "组织类型")
  private Integer type;

  @ApiModelProperty(value = "组织名称")
  private String name;

  @ApiModelProperty(value = "组织地址")
  private String address;

  @ApiModelProperty(value = "组织电话")
  private String tel;

  @ApiModelProperty(value = "组织简介")
  private String intro;

  @ApiModelProperty(value = "组织官网")
  private String web;

  @ApiModelProperty(value = "省")
  private String province;

  @ApiModelProperty(value = "市")
  private String city;

  @ApiModelProperty(value = "区")
  private String area;
}
