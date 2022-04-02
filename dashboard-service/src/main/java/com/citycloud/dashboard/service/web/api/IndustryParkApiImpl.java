package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.IndustryParkApi;
import com.citycloud.dashboard.service.IndustryParkService;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 孟帅
 * @since 2022-04-01
 */
@ApiController(path = "/industryPark")
public class IndustryParkApiImpl implements IndustryParkApi {

    @Autowired
    private IndustryParkService industryParkService;

    @CrossOrigin
    @QueryMapping(value = "/findAll", method = RequestMethod.POST)
    @Override
    public ApiResponse<List<IndustryParkVo>> findAll() {
        List<IndustryParkVo> IndustryParkVos = industryParkService.findAll();
        ApiResponse<List<IndustryParkVo>> apiResponse = ApiResponse.successWithData(IndustryParkVos);
        apiResponse.setTotalCount(Long.max(0, IndustryParkVos.size()));
        return apiResponse;
    }

}
