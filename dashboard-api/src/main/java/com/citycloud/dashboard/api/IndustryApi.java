package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery1;
import com.citycloud.dashboard.viewobject.industry.IndustryVo1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Api(tags = "产业API")
public interface IndustryApi {

    /**
     * 统计每种产业对应的公司数量
     *
     * @param cmd 查询条件
     * @return .
     */
    @ApiOperation(value = "统计每种产业对应的公司数量", notes = "当前区域每种产业公司数量/全国每种产业对应公司数量")
    ApiResponse<IndustryVo1> industryStatistics(@RequestBody @Valid IndustryListQuery cmd);

    /**
     * 统计每种产业对应的公司数量
     *
     * @param cmd 查询条件
     * @return .
     */
    @ApiOperation(value = "统计每种产业对应的公司数量", notes = "当前区域每种产业公司数量/全国每种产业对应公司数量")
    ApiResponse<IndustryVo1> analysis(@RequestBody @Valid IndustryListQuery1 cmd);

}
