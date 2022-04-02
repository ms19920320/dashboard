package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.CompanyDao;
import com.citycloud.dashboard.dao.dataobject.CompanyDo;
import com.citycloud.dashboard.service.CompanyService;
import com.citycloud.dashboard.viewobject.company.CompanyVo;
import com.citycloud.dashboard.viewobject.company.CompanyVo1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public ApiResponse<List<CompanyVo1>> findCompanyGroupByProvince() {
        Long total = companyDao.selectCount(new QueryWrapper<>());
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select(CompanyVo.PROVINCE, "count(" + CompanyVo.PROVINCE + ") as " + CompanyVo1.TOTAL);
        queryWrapper.groupBy(CompanyVo.PROVINCE);
        List<CompanyVo1> companyListByProvince = companyDao.selectMaps(queryWrapper);
        ApiResponse<List<CompanyVo1>> listApiResponse = ApiResponse.successWithData(companyListByProvince);
        listApiResponse.setTotalCount(total);
        return listApiResponse;
    }
}
