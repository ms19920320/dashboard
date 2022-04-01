package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.IndustryParkApi;
import com.citycloud.dashboard.service.IndustryParkService;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
@ApiController(path = "/industryPark")
public class IndustryParkApiImpl implements IndustryParkApi {

    @Autowired
    private IndustryParkService industryParkService;

    @QueryMapping(value = "/findAll", method = RequestMethod.POST)
    @Override
    public ApiResponse<List<IndustryParkVo>> findAll() {
        List<IndustryParkVo> IndustryParkVos = industryParkService.findAll();
        ApiResponse<List<IndustryParkVo>> apiResponse = ApiResponse.successWithData(IndustryParkVos);
        apiResponse.setTotalCount(Long.max(0, IndustryParkVos.size()));
        return apiResponse;
    }

//  @CommandMapping("/create")
//  @Override
//  public ApiResponse<Integer> create(CreateIndustryParkCmd cmd) {
//    Integer result = industryParkService.create(cmd);
//    return ApiResponse.successWithMsgAndData(result, 1000);
//  }
//
//  @CommandMapping("/update")
//  @Override
//  public ApiResponse<Integer> update(UpdateIndustryParkCmd cmd) {
//    Integer result = industryParkService.update(cmd);
//    return ApiResponse.successWithData(result);
//  }
//
//  @CommandMapping("/deleteById")
//  @Override
//  public ApiResponse<Integer> deleteById(DeleteIndustryParkCmd cmd) {
//    Integer result = industryParkService.deleteById(cmd.getId());
//    return ApiResponse.successWithData(result);
//  }
//
//  @QueryMapping("/findById")
//  @Override
//  public ApiResponse<IndustryParkVo> findById(Integer industryParkId) {
//    IndustryParkVo industryParkVo = industryParkService.findById(industryParkId);
//    return ApiResponse.successWithData(industryParkVo);
//  }
//
//  @QueryMapping(value = "/findListByPage", method = RequestMethod.POST)
//  @Override
//  public ApiResponse<PageInfo<IndustryParkVo>> findListByPage(IndustryParkListQuery listQuery) {
//    PageInfo<IndustryParkVo> industryParkVoPageInfo = industryParkService.findListByPage(listQuery);
//    return ApiResponse.successWithData(industryParkVoPageInfo);
//  }
}
