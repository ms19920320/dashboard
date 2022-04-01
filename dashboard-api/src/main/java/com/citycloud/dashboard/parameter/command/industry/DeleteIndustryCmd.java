package com.citycloud.dashboard.parameter.command.industry;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@ApiModel("删除产业链表，包含产业中上游，产业类型，具体产业命令")
public class DeleteIndustryCmd implements ICommand {

  private static final long serialVersionUID = 933948456290631625L;

  /** 产业编号 */
  @ApiModelProperty(value = "产业编号", required = true)
  @NotBlank(message = "[9000,{产业编号}]")
  private String industryId;
}
