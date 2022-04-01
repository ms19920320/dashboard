package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.CompanySoftPatentDo;
import com.citycloud.dashboard.parameter.command.companysoftpatent.CreateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.command.companysoftpatent.UpdateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.query.companysoftpatent.CompanySoftPatentListQuery;
import com.citycloud.dashboard.viewobject.companysoftpatent.CompanySoftPatentVo;
import com.github.pagehelper.PageInfo;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
public interface CompanySoftPatentService extends IService<CompanySoftPatentDo> {

  int create(CreateCompanySoftPatentCmd cmd);

  int update(UpdateCompanySoftPatentCmd cmd);

  int deleteById(Integer id);

  CompanySoftPatentVo findById(Integer id);

  PageInfo<CompanySoftPatentVo> findListByPage(CompanySoftPatentListQuery listQuery);
}
