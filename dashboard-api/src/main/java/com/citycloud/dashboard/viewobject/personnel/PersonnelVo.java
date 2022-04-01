package com.citycloud.dashboard.viewobject.personnel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("personnel")
public class PersonnelVo implements Serializable {

  @ApiModelProperty(value = "人才编号")
  private String personnelId;

  @ApiModelProperty(value = "人才姓名")
  private String name;

  @ApiModelProperty(value = "人才简介")
  private String intro;

  @ApiModelProperty(value = "人才领域")
  private String field;

  @ApiModelProperty(value = "人才关联关系")
  private String relation;
}
