package com.citycloud.dashboard.parameter.query.organize;

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
@ApiModel("organize")
public class OrganizeListQuery implements IQuery {

  private static final long serialVersionUID = 6626453362771414201L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 组织类型 */
  @ApiModelProperty(value = "组织类型")
  @NotNull(message = "[9000,{组织类型}]")
  private Integer type;

  /** 组织名称 */
  @ApiModelProperty(value = "组织名称", required = true)
  @NotBlank(message = "[9000,{组织名称}]")
  private String name;

  /** 组织地址 */
  @ApiModelProperty(value = "组织地址", required = true)
  @NotBlank(message = "[9000,{组织地址}]")
  private String address;

  /** 组织电话 */
  @ApiModelProperty(value = "组织电话")
  @NotBlank(message = "[9000,{组织电话}]")
  private String tel;

  /** 组织简介 */
  @ApiModelProperty(value = "组织简介")
  @NotBlank(message = "[9000,{组织简介}]")
  private String intro;

  /** 组织官网 */
  @ApiModelProperty(value = "组织官网")
  @NotBlank(message = "[9000,{组织官网}]")
  private String web;

  /** 省 */
  @ApiModelProperty(value = "省")
  @NotBlank(message = "[9000,{省}]")
  private String province;

  /** 市 */
  @ApiModelProperty(value = "市")
  @NotBlank(message = "[9000,{市}]")
  private String city;

  /** 区 */
  @ApiModelProperty(value = "区")
  @NotBlank(message = "[9000,{区}]")
  private String area;
}
