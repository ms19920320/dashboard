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
@ApiModel("IndustryListQuery1")
public class IndustryListQuery1 implements IQuery {

    private static final long serialVersionUID = 5287537563742841465L;

    /**
     * 查询条件-产业ID
     */
    @ApiModelProperty(value = "产业ID")
    private String industryId;

    /**
     * 查询条件-省
     */
    @ApiModelProperty(value = "省")
    private String province;

    /**
     * 查询条件-市
     */
    @ApiModelProperty(value = "市", position = 1)
    private String city;

    /**
     * 查询条件-区
     */
    @ApiModelProperty(value = "区", position = 2)
    private String area;

    /**
     * 查询条件-起始日期
     */
    @ApiModelProperty(value = "开始日期 yyyy-MM-dd格式", position = 3)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;

    /**
     * 查询条件-结束日期
     */
    @ApiModelProperty(value = "结束日期 yyyy-MM-dd格式", position = 4)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;
}
