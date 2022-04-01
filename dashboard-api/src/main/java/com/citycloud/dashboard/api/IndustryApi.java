package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.command.industry.CreateIndustryCmd;
import com.citycloud.dashboard.parameter.command.industry.DeleteIndustryCmd;
import com.citycloud.dashboard.parameter.command.industry.UpdateIndustryCmd;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.viewobject.industry.IndustryVo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Api(tags = "产业链表，包含产业中上游，产业类型，具体产业接口")
public interface IndustryApi {

  @ApiOperation(value = "创建产业链表，包含产业中上游，产业类型，具体产业", notes = "创建产业链表，包含产业中上游，产业类型，具体产业信息。")
  ApiResponse<Integer> create(@RequestBody @Valid CreateIndustryCmd cmd);

  @ApiOperation(value = "更新产业链表，包含产业中上游，产业类型，具体产业", notes = "更新产业链表，包含产业中上游，产业类型，具体产业信息。")
  ApiResponse<Integer> update(@RequestBody @Valid UpdateIndustryCmd cmd);

  @ApiOperation(value = "删除产业链表，包含产业中上游，产业类型，具体产业", notes = "根据ID删除产业链表，包含产业中上游，产业类型，具体产业信息。")
  ApiResponse<Integer> deleteById(@RequestBody @Valid DeleteIndustryCmd cmd);

  @ApiOperation(value = "查询产业链表，包含产业中上游，产业类型，具体产业", notes = "根据ID查询产业链表，包含产业中上游，产业类型，具体产业信息。")
  @ApiImplicitParam(name = "id", value = "产业链表，包含产业中上游，产业类型，具体产业ID", required = true)
  ApiResponse<IndustryVo> findById(
      @NotBlank(message = "[9000,{产业链表，包含产业中上游，产业类型，具体产业ID}]") String id);

  @ApiOperation(value = "分页查询产业链表，包含产业中上游，产业类型，具体产业列表", notes = "分页查询产业链表，包含产业中上游，产业类型，具体产业列表。")
  ApiResponse<PageInfo<IndustryVo>> findListByPage(@RequestBody @Valid IndustryListQuery listQuery);
}
