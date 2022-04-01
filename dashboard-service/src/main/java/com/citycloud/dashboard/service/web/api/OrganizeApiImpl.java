package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.dashboard.api.OrganizeApi;
import com.citycloud.dashboard.service.OrganizeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sf
 * @date 2022-04-01
 */
@ApiController(path = "/organize")
public class OrganizeApiImpl implements OrganizeApi {

  @Autowired private OrganizeService organizeService;

}
