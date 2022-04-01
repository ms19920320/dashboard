package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.IndustryParkDo;
import com.citycloud.dashboard.parameter.command.industrypark.CreateIndustryParkCmd;
import com.citycloud.dashboard.parameter.command.industrypark.UpdateIndustryParkCmd;
import com.citycloud.dashboard.parameter.query.industrypark.IndustryParkListQuery;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
public interface IndustryParkService extends IService<IndustryParkDo> {
    List<IndustryParkVo> findAll();

//  int create(CreateIndustryParkCmd cmd);
//
//  int update(UpdateIndustryParkCmd cmd);
//
//  int deleteById(Integer id);
//
//  IndustryParkVo findById(Integer id);
//
//  PageInfo<IndustryParkVo> findListByPage(IndustryParkListQuery listQuery);
}
