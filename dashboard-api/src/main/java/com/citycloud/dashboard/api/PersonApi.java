package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.command.person.CreatePersonCmd;
import com.citycloud.dashboard.parameter.command.person.DeletePersonCmd;
import com.citycloud.dashboard.parameter.command.person.UpdatePersonCmd;
import com.citycloud.dashboard.parameter.query.person.PersonListQuery;
import com.citycloud.dashboard.viewobject.person.PersonVo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Api(tags = "null接口")
public interface PersonApi {

  @ApiOperation(value = "创建null", notes = "创建null信息。")
  ApiResponse<Integer> create(@RequestBody @Valid CreatePersonCmd cmd);

  @ApiOperation(value = "更新null", notes = "更新null信息。")
  ApiResponse<Integer> update(@RequestBody @Valid UpdatePersonCmd cmd);

  @ApiOperation(value = "删除null", notes = "根据ID删除null信息。")
  ApiResponse<Integer> deleteById(@RequestBody @Valid DeletePersonCmd cmd);

  @ApiOperation(value = "查询null", notes = "根据ID查询null信息。")
  @ApiImplicitParam(name = "id", value = "nullID", required = true)
  ApiResponse<PersonVo> findById(@NotNull(message = "[9000,{nullID}]") Integer id);

  @ApiOperation(value = "分页查询null列表", notes = "分页查询null列表。")
  ApiResponse<PageInfo<PersonVo>> findListByPage(@RequestBody @Valid PersonListQuery listQuery);
}
