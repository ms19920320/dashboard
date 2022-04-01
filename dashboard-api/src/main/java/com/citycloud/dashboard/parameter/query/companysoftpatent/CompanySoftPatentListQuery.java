package com.citycloud.dashboard.parameter.query.companysoftpatent;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("company_soft_patent")
public class CompanySoftPatentListQuery implements IQuery {

  private static final long serialVersionUID = -392543538982392110L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 组织ID */
  @ApiModelProperty(value = "组织ID")
  @NotBlank(message = "[9000,{组织ID}]")
  private String companyId;

  /** 专利ID */
  @ApiModelProperty(value = "专利ID")
  @NotBlank(message = "[9000,{专利ID}]")
  private String softPatentId;
}
