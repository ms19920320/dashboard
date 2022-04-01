package com.citycloud.dashboard.parameter.command.personneltag;

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
@ApiModel("创建人才tag关联表命令")
public class CreatePersonnelTagCmd implements ICommand {

  private static final long serialVersionUID = 1385480113710222448L;

  /** 人才编号 */
  @ApiModelProperty(value = "人才编号", required = true)
  @NotBlank(message = "[9000,{人才编号}]")
  private String personnelId;

  /** 产业编号 */
  @ApiModelProperty(value = "产业编号", required = true)
  @NotBlank(message = "[9000,{产业编号}]")
  private String industryId;
}
