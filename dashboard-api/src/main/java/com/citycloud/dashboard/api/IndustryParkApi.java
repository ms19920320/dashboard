package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author MoliCode
 * @since 2022-04-01
 */
@Api(tags = "产业园接口")
public interface IndustryParkApi {
  @ApiOperation(value = "获取所有产业园", notes = "获取所有产业园信息")
  ApiResponse<List<IndustryParkVo>> findAll();

}
