package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.dashboard.api.PersonnelTagApi;
import com.citycloud.dashboard.service.PersonnelTagService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sf
 * @date 2022-04-01
 */
@ApiController(path = "/personnelTag")
public class PersonnelTagApiImpl implements PersonnelTagApi {

  @Autowired private PersonnelTagService personnelTagService;

}
