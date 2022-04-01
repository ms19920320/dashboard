package com.citycloud.dashboard.viewobject.softpatent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("soft_patent")
public class SoftPatentVo implements Serializable {

  @ApiModelProperty(value = "专利/软著表id")
  private String softPatentId;

  @ApiModelProperty(value = "专利/软著名称")
  private String name;

  @ApiModelProperty(value = "类型")
  private Integer type;

  @ApiModelProperty(value = "专利/软著编号")
  private String code;

  @ApiModelProperty(value = "日期")
  private java.sql.Timestamp date;
}
