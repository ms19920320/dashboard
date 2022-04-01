package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.CommandMapping;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.CompanySoftPatentApi;
import com.citycloud.dashboard.parameter.command.companysoftpatent.CreateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.command.companysoftpatent.DeleteCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.command.companysoftpatent.UpdateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.query.companysoftpatent.CompanySoftPatentListQuery;
import com.citycloud.dashboard.service.CompanySoftPatentService;
import com.citycloud.dashboard.viewobject.companysoftpatent.CompanySoftPatentVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@ApiController(path = "/companySoftPatent")
public class CompanySoftPatentApiImpl implements CompanySoftPatentApi {

  @Autowired private CompanySoftPatentService companySoftPatentService;

  @CommandMapping("/create")
  @Override
  public ApiResponse<Integer> create(CreateCompanySoftPatentCmd cmd) {
    Integer result = companySoftPatentService.create(cmd);
    return ApiResponse.successWithMsgAndData(result, 1000);
  }

  @CommandMapping("/update")
  @Override
  public ApiResponse<Integer> update(UpdateCompanySoftPatentCmd cmd) {
    Integer result = companySoftPatentService.update(cmd);
    return ApiResponse.successWithData(result);
  }

  @CommandMapping("/deleteById")
  @Override
  public ApiResponse<Integer> deleteById(DeleteCompanySoftPatentCmd cmd) {
    Integer result = companySoftPatentService.deleteById(cmd.getId());
    return ApiResponse.successWithData(result);
  }

  @QueryMapping("/findById")
  @Override
  public ApiResponse<CompanySoftPatentVo> findById(Integer companySoftPatentId) {
    CompanySoftPatentVo companySoftPatentVo =
        companySoftPatentService.findById(companySoftPatentId);
    return ApiResponse.successWithData(companySoftPatentVo);
  }

  @QueryMapping(value = "/findListByPage", method = RequestMethod.POST)
  @Override
  public ApiResponse<PageInfo<CompanySoftPatentVo>> findListByPage(
      CompanySoftPatentListQuery listQuery) {
    PageInfo<CompanySoftPatentVo> companySoftPatentVoPageInfo =
        companySoftPatentService.findListByPage(listQuery);
    return ApiResponse.successWithData(companySoftPatentVoPageInfo);
  }
}
