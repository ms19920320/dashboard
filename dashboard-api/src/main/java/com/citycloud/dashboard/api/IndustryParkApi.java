package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

;import java.util.List;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
@Api(tags = "产业园接口")
public interface IndustryParkApi {
  @ApiOperation(value = "获取所有产业园", notes = "获取所有产业园信息")
  ApiResponse<List<IndustryParkVo>> findAll();

//  @ApiOperation(value = "创建产业园", notes = "创建产业园信息。")
//  ApiResponse<Integer> create(@RequestBody @Valid CreateIndustryParkCmd cmd);
//
//  @ApiOperation(value = "更新产业园", notes = "更新产业园信息。")
//  ApiResponse<Integer> update(@RequestBody @Valid UpdateIndustryParkCmd cmd);
//
//  @ApiOperation(value = "删除产业园", notes = "根据ID删除产业园信息。")
//  ApiResponse<Integer> deleteById(@RequestBody @Valid DeleteIndustryParkCmd cmd);
//
//  @ApiOperation(value = "查询产业园", notes = "根据ID查询产业园信息。")
//  @ApiImplicitParam(name = "id", value = "产业园ID", required = true)
//  ApiResponse<IndustryParkVo> findById(@NotNull(message = "[9000,{产业园ID}]") Integer id);
//
//  @ApiOperation(value = "分页查询产业园列表", notes = "分页查询产业园列表。")
//  ApiResponse<PageInfo<IndustryParkVo>> findListByPage(
//      @RequestBody @Valid IndustryParkListQuery listQuery);
}
