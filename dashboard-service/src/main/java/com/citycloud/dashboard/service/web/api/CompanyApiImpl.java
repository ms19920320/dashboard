package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.CommandMapping;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.CompanyApi;
import com.citycloud.dashboard.parameter.command.company.CreateCompanyCmd;
import com.citycloud.dashboard.parameter.command.company.DeleteCompanyCmd;
import com.citycloud.dashboard.parameter.command.company.UpdateCompanyCmd;
import com.citycloud.dashboard.parameter.query.company.CompanyListQuery;
import com.citycloud.dashboard.service.CompanyService;
import com.citycloud.dashboard.viewobject.company.CompanyVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
@ApiController(path = "/company")
public class CompanyApiImpl implements CompanyApi {

  @Autowired private CompanyService companyService;

  @CommandMapping("/create")
  @Override
  public ApiResponse<Integer> create(CreateCompanyCmd cmd) {
    Integer result = companyService.create(cmd);
    return ApiResponse.successWithMsgAndData(result, 1000);
  }

  @CommandMapping("/update")
  @Override
  public ApiResponse<Integer> update(UpdateCompanyCmd cmd) {
    Integer result = companyService.update(cmd);
    return ApiResponse.successWithData(result);
  }

  @CommandMapping("/deleteById")
  @Override
  public ApiResponse<Integer> deleteById(DeleteCompanyCmd cmd) {
    Integer result = companyService.deleteById(cmd.getCompanyId());
    return ApiResponse.successWithData(result);
  }

  @QueryMapping("/findById")
  @Override
  public ApiResponse<CompanyVo> findById(String companyId) {
    CompanyVo companyVo = companyService.findById(companyId);
    return ApiResponse.successWithData(companyVo);
  }

  @QueryMapping(value = "/findListByPage", method = RequestMethod.POST)
  public ApiResponse<PageInfo<CompanyVo>> findListByPage(CompanyListQuery listQuery) {
    PageInfo<CompanyVo> companyVoPageInfo = companyService.findListByPage(listQuery);
    return ApiResponse.successWithData(companyVoPageInfo);
  }
}
