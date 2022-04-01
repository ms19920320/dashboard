package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.CompanyDao;
import com.citycloud.dashboard.dao.dataobject.CompanyDo;
import com.citycloud.dashboard.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Slf4j
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyDao, CompanyDo>
        implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public ApiResponse<List<Map<String, Object>>> findCompanyGroupByProvince() {
        Long total = companyDao.selectCount(new QueryWrapper<>());
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select("province", "count(province) as total");
        queryWrapper.groupBy("province");
        List<Map<String, Object>> companyListByProvince = companyDao.selectMaps(queryWrapper);
        ApiResponse<List<Map<String, Object>>> listApiResponse = ApiResponse.successWithData(companyListByProvince);
        listApiResponse.setTotalCount(total);
        return listApiResponse;
    }
}
