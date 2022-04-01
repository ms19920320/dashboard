package com.citycloud.dashboard.parameter.command.personneltag;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("更新人才tag关联表命令")
public class UpdatePersonnelTagCmd implements ICommand {

  private static final long serialVersionUID = 6291717863698097925L;

  /** 主键 */
  @ApiModelProperty(value = "主键", required = true)
  @NotNull(message = "[9000,{主键}]")
  private Integer id;

  /** 人才编号 */
  @ApiModelProperty(value = "人才编号", required = true)
  @NotBlank(message = "[9000,{人才编号}]")
  private String personnelId;

  /** 产业编号 */
  @ApiModelProperty(value = "产业编号", required = true)
  @NotBlank(message = "[9000,{产业编号}]")
  private String industryId;
}
