package com.citycloud.dashboard.viewobject.personneltag;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("personnel_tag")
public class PersonnelTagVo implements Serializable {

  @ApiModelProperty(value = "主键")
  private Integer id;

  @ApiModelProperty(value = "人才编号")
  private String personnelId;

  @ApiModelProperty(value = "产业编号")
  private String industryId;
}
