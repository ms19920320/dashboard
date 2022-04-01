package com.citycloud.dashboard.parameter.query.personneltag;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("personnel_tag")
public class PersonnelTagListQuery implements IQuery {

  private static final long serialVersionUID = 287163279577502674L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 人才编号 */
  @ApiModelProperty(value = "人才编号", required = true)
  @NotBlank(message = "[9000,{人才编号}]")
  private String personnelId;

  /** 产业编号 */
  @ApiModelProperty(value = "产业编号", required = true)
  @NotBlank(message = "[9000,{产业编号}]")
  private String industryId;
}
