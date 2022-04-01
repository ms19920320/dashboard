package com.citycloud.dashboard.viewobject.companysoftpatent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
@Data
@ApiModel("company_soft_patent")
public class CompanySoftPatentVo implements Serializable {

  @ApiModelProperty(value = "主键")
  private Integer id;

  @ApiModelProperty(value = "组织ID")
  private String companyId;

  @ApiModelProperty(value = "专利ID")
  private String softPatentId;
}
