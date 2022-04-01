package com.citycloud.dashboard.parameter.query.personnel;

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
@ApiModel("personnel")
public class PersonnelListQuery implements IQuery {

  private static final long serialVersionUID = -7551963662911174895L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 人才姓名 */
  @ApiModelProperty(value = "人才姓名", required = true)
  @NotBlank(message = "[9000,{人才姓名}]")
  private String name;

  /** 人才简介 */
  @ApiModelProperty(value = "人才简介")
  @NotBlank(message = "[9000,{人才简介}]")
  private String intro;

  /** 人才领域 */
  @ApiModelProperty(value = "人才领域")
  @NotBlank(message = "[9000,{人才领域}]")
  private String field;

  /** 人才关联关系 */
  @ApiModelProperty(value = "人才关联关系")
  @NotBlank(message = "[9000,{人才关联关系}]")
  private String relation;
}
