package com.citycloud.dashboard.parameter.command.softpatent;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("更新null命令")
public class UpdateSoftPatentCmd implements ICommand {

  private static final long serialVersionUID = -2212378606288058577L;

  /** 专利/软著表id */
  @ApiModelProperty(value = "专利/软著表id", required = true)
  @NotBlank(message = "[9000,{专利/软著表id}]")
  private String softPatentId;

  /** 专利/软著名称 */
  @ApiModelProperty(value = "专利/软著名称", required = true)
  @NotBlank(message = "[9000,{专利/软著名称}]")
  private String name;

  /** 类型 */
  @ApiModelProperty(value = "类型")
  @NotNull(message = "[9000,{类型}]")
  private String type;

  /** 专利/软著编号 */
  @ApiModelProperty(value = "专利/软著编号")
  @NotBlank(message = "[9000,{专利/软著编号}]")
  private String code;

  /** 日期 */
  @ApiModelProperty(value = "日期")
  @NotNull(message = "[9000,{日期}]")
  private Date date;
}
