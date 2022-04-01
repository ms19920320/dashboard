package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.command.companysoftpatent.CreateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.command.companysoftpatent.DeleteCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.command.companysoftpatent.UpdateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.query.companysoftpatent.CompanySoftPatentListQuery;
import com.citycloud.dashboard.viewobject.companysoftpatent.CompanySoftPatentVo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Api(tags = "组织和专利关联表接口")
public interface CompanySoftPatentApi {

  @ApiOperation(value = "创建组织和专利关联表", notes = "创建组织和专利关联表信息。")
  ApiResponse<Integer> create(@RequestBody @Valid CreateCompanySoftPatentCmd cmd);

  @ApiOperation(value = "更新组织和专利关联表", notes = "更新组织和专利关联表信息。")
  ApiResponse<Integer> update(@RequestBody @Valid UpdateCompanySoftPatentCmd cmd);

  @ApiOperation(value = "删除组织和专利关联表", notes = "根据ID删除组织和专利关联表信息。")
  ApiResponse<Integer> deleteById(@RequestBody @Valid DeleteCompanySoftPatentCmd cmd);

  @ApiOperation(value = "查询组织和专利关联表", notes = "根据ID查询组织和专利关联表信息。")
  @ApiImplicitParam(name = "id", value = "组织和专利关联表ID", required = true)
  ApiResponse<CompanySoftPatentVo> findById(@NotNull(message = "[9000,{组织和专利关联表ID}]") Integer id);

  @ApiOperation(value = "分页查询组织和专利关联表列表", notes = "分页查询组织和专利关联表列表。")
  ApiResponse<PageInfo<CompanySoftPatentVo>> findListByPage(
      @RequestBody @Valid CompanySoftPatentListQuery listQuery);
}
