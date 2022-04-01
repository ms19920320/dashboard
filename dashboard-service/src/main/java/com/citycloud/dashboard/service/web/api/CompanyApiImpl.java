package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.CompanyApi;
import com.citycloud.dashboard.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@ApiController(path = "/company")
public class CompanyApiImpl implements CompanyApi {

  @Autowired private CompanyService companyService;

  @QueryMapping(value = "/findCompanyGroupByProvince", method = RequestMethod.POST)
  @Override
  public ApiResponse<List<Map<String, Object>>> findCompanyGroupByProvince() {
    return companyService.findCompanyGroupByProvince();
  }
}
