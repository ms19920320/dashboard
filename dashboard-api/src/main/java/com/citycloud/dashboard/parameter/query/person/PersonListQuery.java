package com.citycloud.dashboard.parameter.query.person;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Data
@ApiModel("person")
public class PersonListQuery implements IQuery {

  private static final long serialVersionUID = 1504761714166169742L;

  @Min(value = 1, message = "[9004,{当前页},{1}]")
  @NotNull(message = "[9000,{分页pageNum}]")
  private Integer pageNum;

  @Min(value = 1, message = "[9004,{每页记录数},{1}]")
  @NotNull(message = "[9000,{分页pageSize}]")
  private Integer pageSize;

  /** 姓名 */
  @ApiModelProperty(value = "姓名")
  private String name;

  /** 年龄 */
  @ApiModelProperty(value = "年龄")
  private Integer age;
}
