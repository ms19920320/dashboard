package com.citycloud.dashboard.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citycloud.dashboard.dao.dataobject.CompanyDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Mapper
public interface CompanyDao extends BaseMapper<CompanyDo> {}
