package com.citycloud.dashboard.parameter.query.industry;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("industry")
public class IndustryListQuery implements IQuery {

  private static final long serialVersionUID = 5287537563742841465L;

  /** 查询条件-起始日期 */
  @ApiModelProperty(value = "开始日期")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date startDate;

  /** 查询条件-结束日期 */
  @ApiModelProperty(value = "结束日期")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date endDate;

  /** 查询条件-省 */
  @ApiModelProperty(value = "省")
  private String province;

  /** 查询条件-省 */
  @ApiModelProperty(value = "市")
  private String city;

  /** 查询条件-区 */
  @ApiModelProperty(value = "区")
  private String area;
}
