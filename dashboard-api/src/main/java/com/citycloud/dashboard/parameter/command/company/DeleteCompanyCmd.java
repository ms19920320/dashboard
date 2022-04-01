package com.citycloud.dashboard.parameter.command.company;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("删除null命令")
public class DeleteCompanyCmd implements ICommand {

  private static final long serialVersionUID = -8890955933380231204L;

  /** 编号 */
  @ApiModelProperty(value = "编号", required = true)
  @NotBlank(message = "[9000,{编号}]")
  private String companyId;
}
