package com.citycloud.dashboard.dao;

import com.citycloud.dashboard.dao.dataobject.PersonDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Mapper
public interface PersonDao extends BaseMapper<PersonDo> {}
