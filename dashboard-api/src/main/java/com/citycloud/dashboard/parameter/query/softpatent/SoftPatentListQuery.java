package com.citycloud.dashboard.parameter.query.softpatent;

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
@ApiModel("soft_patent")
public class SoftPatentListQuery implements IQuery {

  private static final long serialVersionUID = -6154515931962684265L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 专利/软著名称 */
  @ApiModelProperty(value = "专利/软著名称", required = true)
  @NotBlank(message = "[9000,{专利/软著名称}]")
  private String name;

  /** 类型 */
  @ApiModelProperty(value = "类型")
  @NotNull(message = "[9000,{类型}]")
  private Integer type;

  /** 专利/软著编号 */
  @ApiModelProperty(value = "专利/软著编号")
  @NotBlank(message = "[9000,{专利/软著编号}]")
  private String code;

  /** 日期 */
  @ApiModelProperty(value = "日期")
  @NotNull(message = "[9000,{日期}]")
  private java.sql.Timestamp date;
}
