/*
 * 城云科技 ©1997-2022
 */

package com.citycloud.dashboard.parameter.query.softpatent;

import com.citycloud.ccuap.web.api.parameter.IQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

/**
 * 专利/软著数量及增长趋势统计接口入参
 *
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("SoftPatentListQuery1")
public class SoftPatentListQuery1 implements IQuery {

    private static final long serialVersionUID = -392543538982392110L;

    /**
     * 查询条件-起始日期
     */
    @ApiModelProperty(value = "开始日期 yyyy格式")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    private Date startDate;

    /**
     * 查询条件-结束日期
     */
    @ApiModelProperty(value = "结束日期 yyyy格式", position = 1)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    private Date endDate;
}
