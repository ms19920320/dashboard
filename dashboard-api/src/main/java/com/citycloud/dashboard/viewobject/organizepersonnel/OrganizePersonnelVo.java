package com.citycloud.dashboard.viewobject.organizepersonnel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("organize_personnel")
public class OrganizePersonnelVo implements Serializable {

  @ApiModelProperty(value = "关联表id")
  private Integer id;

  @ApiModelProperty(value = "组织ID")
  private String organizeId;

  @ApiModelProperty(value = "人才ID")
  private String personnelId;
}
