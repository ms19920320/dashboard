package com.citycloud.dashboard.parameter.command.organizepersonnel;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("创建组织和人才关联表命令")
public class CreateOrganizePersonnelCmd implements ICommand {

  private static final long serialVersionUID = -6795103786441489323L;

  /** 组织ID */
  @ApiModelProperty(value = "组织ID")
  @NotBlank(message = "[9000,{组织ID}]")
  private String organizeId;

  /** 人才ID */
  @ApiModelProperty(value = "人才ID")
  @NotBlank(message = "[9000,{人才ID}]")
  private String personnelId;
}
