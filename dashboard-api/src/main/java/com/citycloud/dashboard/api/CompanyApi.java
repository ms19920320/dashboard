package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.command.company.CreateCompanyCmd;
import com.citycloud.dashboard.parameter.command.company.DeleteCompanyCmd;
import com.citycloud.dashboard.parameter.command.company.UpdateCompanyCmd;
import com.citycloud.dashboard.viewobject.company.CompanyVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
@Api(tags = "null接口")
public interface CompanyApi {

  @ApiOperation(value = "创建null", notes = "创建null信息。")
  ApiResponse<Integer> create(@RequestBody @Valid CreateCompanyCmd cmd);

  @ApiOperation(value = "更新null", notes = "更新null信息。")
  ApiResponse<Integer> update(@RequestBody @Valid UpdateCompanyCmd cmd);

  @ApiOperation(value = "删除null", notes = "根据ID删除null信息。")
  ApiResponse<Integer> deleteById(@RequestBody @Valid DeleteCompanyCmd cmd);

  @ApiOperation(value = "查询null", notes = "根据ID查询null信息。")
  @ApiImplicitParam(name = "id", value = "nullID", required = true)
  ApiResponse<CompanyVo> findById(@NotBlank(message = "[9000,{nullID}]") String id);

}
