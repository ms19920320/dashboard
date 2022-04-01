package com.citycloud.dashboard.parameter.query.industrypark;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
@Data
@ApiModel("industry_park")
public class IndustryParkListQuery implements IQuery {

  private static final long serialVersionUID = -3816936619858926965L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 名称 */
  @ApiModelProperty(value = "名称")
  @NotBlank(message = "[9000,{名称}]")
  private String name;

  /** 省 */
  @ApiModelProperty(value = "省")
  @NotBlank(message = "[9000,{省}]")
  private String province;

  /** 市 */
  @ApiModelProperty(value = "市")
  @NotBlank(message = "[9000,{市}]")
  private String city;

  /** 区/县 */
  @ApiModelProperty(value = "区/县")
  @NotBlank(message = "[9000,{区/县}]")
  private String area;
}
