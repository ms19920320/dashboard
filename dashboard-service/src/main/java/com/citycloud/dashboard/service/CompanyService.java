package com.citycloud.dashboard.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.CompanyDo;
import com.citycloud.dashboard.parameter.command.company.CreateCompanyCmd;
import com.citycloud.dashboard.parameter.command.company.UpdateCompanyCmd;
import com.citycloud.dashboard.parameter.query.company.CompanyListQuery;
import com.citycloud.dashboard.viewobject.company.CompanyVo;
import com.github.pagehelper.PageInfo;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
public interface CompanyService extends IService<CompanyDo> {

  int create(CreateCompanyCmd cmd);

  int update(UpdateCompanyCmd cmd);

  int deleteById(String id);

  CompanyVo findById(String id);

  PageInfo<CompanyVo> findListByPage(CompanyListQuery listQuery);
}
