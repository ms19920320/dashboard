package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.dashboard.api.PersonnelApi;
import com.citycloud.dashboard.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sf
 * @date 2022-04-01
 */
@ApiController(path = "/personnel")
public class PersonnelApiImpl implements PersonnelApi {

  @Autowired private PersonnelService personnelService;

}
