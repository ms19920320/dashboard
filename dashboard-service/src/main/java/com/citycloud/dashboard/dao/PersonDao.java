package com.citycloud.dashboard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citycloud.dashboard.dao.dataobject.PersonDo;
import com.citycloud.dashboard.viewobject.person.PersonVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Mapper
public interface PersonDao extends BaseMapper<PersonDo> {

    List<PersonVo> getPersons();
}
