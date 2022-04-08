package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.SoftPatentApi;
import com.citycloud.dashboard.service.SoftPatentService;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByTypeRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author sf
 * @date 2022-04-01
 */
@ApiController(path = "/softPatent")
public class SoftPatentApiImpl implements SoftPatentApi {

    @Autowired
    private SoftPatentService softPatentService;

    @QueryMapping(value = "softPatentStaticsByType", method = RequestMethod.POST)
    @Override
    public ApiResponse<List<PatentStaticsByTypeRes>> softPatentStaticsByType() {
        return ApiResponse.successWithData(softPatentService.softPatentStaticsByType());
    }
}
