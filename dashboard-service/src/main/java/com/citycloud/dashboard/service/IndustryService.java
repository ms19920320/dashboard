package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.IndustryDo;
import com.citycloud.dashboard.parameter.command.industry.CreateIndustryCmd;
import com.citycloud.dashboard.parameter.command.industry.UpdateIndustryCmd;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.viewobject.industry.IndustryVo;
import com.github.pagehelper.PageInfo;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
public interface IndustryService extends IService<IndustryDo> {

  int create(CreateIndustryCmd cmd);

  int update(UpdateIndustryCmd cmd);

  int deleteById(String id);

  IndustryVo findById(String id);

  PageInfo<IndustryVo> findListByPage(IndustryListQuery listQuery);
}
