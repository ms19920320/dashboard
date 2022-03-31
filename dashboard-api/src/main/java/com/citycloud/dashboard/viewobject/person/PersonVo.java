package com.citycloud.dashboard.viewobject.person;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Data
@ApiModel("person")
public class PersonVo implements Serializable {

  @ApiModelProperty(value = "主键")
  private Integer id;

  @ApiModelProperty(value = "姓名")
  private String name;

  @ApiModelProperty(value = "年龄")
  private Integer age;
}
