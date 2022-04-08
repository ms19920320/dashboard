package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByDateRes;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByTypeRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * 软件/专著操作接口
 *
 * @author 孟帅
 * @since  2022-04-01
 */
@Api(tags = "软件-专著操作API")
public interface SoftPatentApi {

    /**
     * 统计专利/软著总量
     *
     * @return .
     */
    @ApiOperation(value = "统计专利/软著总量", notes = "统计专利/软著总量")
    ApiResponse<List<PatentStaticsByTypeRes>> softPatentStaticsByType();

    /**
     * 按时间统计统计专利/软著
     *
     * @return .
     */
    @ApiOperation(value = "按日期统计专利/软著总览", notes = "按日期统计专利/软著总览")
    ApiResponse<List<PatentStaticsByDateRes>> softPatentStaticsByDate();

}
