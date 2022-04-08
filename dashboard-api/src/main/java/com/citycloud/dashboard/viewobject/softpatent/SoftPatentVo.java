package com.citycloud.dashboard.viewobject.softpatent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("SoftPatentVo")
public class SoftPatentVo implements Serializable {

  @ApiModelProperty(value = "专利/软著表id")
  private String softPatentId;

  @ApiModelProperty(value = "专利/软著名称")
  private String name;

  @ApiModelProperty(value = "类型")
  private String type;

  @ApiModelProperty(value = "专利/软著编号")
  private String code;

  @ApiModelProperty(value = "日期")
  private Date date;
}
