package com.citycloud.dashboard.parameter.query.organizepersonnel;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@ApiModel("organize_personnel")
public class OrganizePersonnelListQuery implements IQuery {

  private static final long serialVersionUID = -2737208628925705203L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 组织ID */
  @ApiModelProperty(value = "组织ID")
  @NotBlank(message = "[9000,{组织ID}]")
  private String organizeId;

  /** 人才ID */
  @ApiModelProperty(value = "人才ID")
  @NotBlank(message = "[9000,{人才ID}]")
  private String personnelId;
}
