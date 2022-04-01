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
@ApiModel("删除组织和人才关联表命令")
public class DeleteOrganizePersonnelCmd implements ICommand {

  private static final long serialVersionUID = -7658171312511498401L;

  /** 关联表id */
  @ApiModelProperty(value = "关联表id", required = true)
  @NotNull(message = "[9000,{关联表id}]")
  private Integer id;
}
