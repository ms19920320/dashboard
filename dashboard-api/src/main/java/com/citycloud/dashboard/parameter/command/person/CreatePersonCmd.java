package com.citycloud.dashboard.parameter.command.person;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Data
@ApiModel("创建null1命令")
public class CreatePersonCmd implements ICommand {

  private static final long serialVersionUID = -9171378999749485615L;

  /** 姓名 */
  @ApiModelProperty(value = "姓名")
  @NotBlank(message = "[9000,{姓名}]")
  private String name;

  /** 年龄 */
  @ApiModelProperty(value = "年龄")
  @NotNull(message = "[9000,{年龄}]")
  private Integer age;
}
