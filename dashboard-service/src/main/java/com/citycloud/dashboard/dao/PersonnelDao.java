package com.citycloud.dashboard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citycloud.dashboard.dao.dataobject.PersonnelDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sf
 * @date 2022-04-01
 */
@Mapper
public interface PersonnelDao extends BaseMapper<PersonnelDo> {}
