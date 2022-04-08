package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.query.softpatent.SoftPatentListQuery1;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByTypeRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 软件/专著操作接口
 *
 * @author 孟帅
 * @since  2022-04-01
 */
@Api(tags = "软件/专著操作接口")
public interface SoftPatentApi {

    /**
     * 统计专利/软著总量
     *
     * @return .
     */
    @ApiOperation(value = "统计专利/软著总量", notes = "统计专利/软著总量")
    ApiResponse<List<PatentStaticsByTypeRes>> softPatentStaticsByType();

//    /**
//     * 统计专利/软著总量及增长趋势
//     *
//     * @param cmd 请求参数
//     * @return .
//     */
//    @ApiOperation(value = "统计专利软著数量及增长趋势", notes = "统计专利软著数量及增长趋势")
//    ApiResponse<List<IndustryParkVo>> softPatentStaticsByDate(@RequestBody @Valid SoftPatentListQuery1 cmd);
//
//    /**
//     * 统计专利/软著总量及增长趋势
//     *
//     * @param cmd 请求参数
//     * @return .
//     */
//    @ApiOperation(value = "统计专利软著数量及增长趋势", notes = "统计专利软著数量及增长趋势")
//    ApiResponse<List<IndustryParkVo>> softPatentStaticsByProvince(@RequestBody @Valid SoftPatentListQuery1 cmd);
}
