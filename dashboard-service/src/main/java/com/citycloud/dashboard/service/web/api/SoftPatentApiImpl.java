package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.dashboard.api.SoftPatentApi;
import com.citycloud.dashboard.service.SoftPatentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sf
 * @date 2022-04-01
 */
@ApiController(path = "/softPatent")
public class SoftPatentApiImpl implements SoftPatentApi {

  @Autowired private SoftPatentService softPatentService;

}
