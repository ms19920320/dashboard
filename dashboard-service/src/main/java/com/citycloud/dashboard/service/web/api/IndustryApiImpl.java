package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.CommandMapping;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.IndustryApi;
import com.citycloud.dashboard.parameter.command.industry.CreateIndustryCmd;
import com.citycloud.dashboard.parameter.command.industry.DeleteIndustryCmd;
import com.citycloud.dashboard.parameter.command.industry.UpdateIndustryCmd;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.service.IndustryService;
import com.citycloud.dashboard.viewobject.industry.IndustryVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author 孟帅
 * @since 2022-03-31
 */
@ApiController(path = "/industry")
public class IndustryApiImpl implements IndustryApi {

  @Autowired private IndustryService industryService;

  @CommandMapping("/create")
  @Override
  public ApiResponse<Integer> create(CreateIndustryCmd cmd) {
    Integer result = industryService.create(cmd);
    return ApiResponse.successWithMsgAndData(result, 1000);
  }

  @CommandMapping("/update")
  @Override
  public ApiResponse<Integer> update(UpdateIndustryCmd cmd) {
    Integer result = industryService.update(cmd);
    return ApiResponse.successWithData(result);
  }

  @CommandMapping("/deleteById")
  @Override
  public ApiResponse<Integer> deleteById(DeleteIndustryCmd cmd) {
    Integer result = industryService.deleteById(cmd.getIndustryId());
    return ApiResponse.successWithData(result);
  }

  @QueryMapping("/findById")
  @Override
  public ApiResponse<IndustryVo> findById(String industryId) {
    IndustryVo industryVo = industryService.findById(industryId);
    return ApiResponse.successWithData(industryVo);
  }

  @QueryMapping(value = "/findListByPage", method = RequestMethod.POST)
  @Override
  public ApiResponse<PageInfo<IndustryVo>> findListByPage(IndustryListQuery listQuery) {
    PageInfo<IndustryVo> industryVoPageInfo = industryService.findListByPage(listQuery);
    return ApiResponse.successWithData(industryVoPageInfo);
  }
}
