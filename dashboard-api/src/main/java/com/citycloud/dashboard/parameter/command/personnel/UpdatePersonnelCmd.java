package com.citycloud.dashboard.parameter.command.personnel;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("更新人才表，包含人才信息命令")
public class UpdatePersonnelCmd implements ICommand {

  private static final long serialVersionUID = 5953540874407453660L;

  /** 人才编号 */
  @ApiModelProperty(value = "人才编号", required = true)
  @NotBlank(message = "[9000,{人才编号}]")
  private String personnelId;

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
