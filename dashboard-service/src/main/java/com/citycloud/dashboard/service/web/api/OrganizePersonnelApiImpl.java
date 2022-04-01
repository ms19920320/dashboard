package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.dashboard.api.OrganizePersonnelApi;
import com.citycloud.dashboard.service.OrganizePersonnelService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sf
 * @date 2022-04-01
 */
@ApiController(path = "/organizePersonnel")
public class OrganizePersonnelApiImpl implements OrganizePersonnelApi {

  @Autowired private OrganizePersonnelService organizePersonnelService;

}
