package com.citycloud.dashboard.parameter.command.organize;

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
@ApiModel("删除组织机构，包含研究机构和高校命令")
public class DeleteOrganizeCmd implements ICommand {

  private static final long serialVersionUID = -8944284636618840618L;

  /** 组织编号 */
  @ApiModelProperty(value = "组织编号", required = true)
  @NotBlank(message = "[9000,{组织编号}]")
  private String organizeId;
}
