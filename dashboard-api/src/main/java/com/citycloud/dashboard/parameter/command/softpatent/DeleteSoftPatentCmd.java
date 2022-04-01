package com.citycloud.dashboard.parameter.command.softpatent;

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
@ApiModel("删除null命令")
public class DeleteSoftPatentCmd implements ICommand {

  private static final long serialVersionUID = -8566454508493364062L;

  /** 专利/软著表id */
  @ApiModelProperty(value = "专利/软著表id", required = true)
  @NotBlank(message = "[9000,{专利/软著表id}]")
  private String softPatentId;
}
