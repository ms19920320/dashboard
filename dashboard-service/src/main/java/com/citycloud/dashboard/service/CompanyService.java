package com.citycloud.dashboard.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.dataobject.CompanyDo;

import java.util.List;
import java.util.Map;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
public interface CompanyService extends IService<CompanyDo> {
    /**
     * 统计不同省份企业数量及全国企业总数量
     *
     * @return .
     */
    ApiResponse<List<Map<String, Object>>> findCompanyGroupByProvince();

}
