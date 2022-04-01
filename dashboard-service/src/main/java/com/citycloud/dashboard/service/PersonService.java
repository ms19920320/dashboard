package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.PersonDo;
import com.citycloud.dashboard.parameter.command.person.CreatePersonCmd;
import com.citycloud.dashboard.parameter.command.person.UpdatePersonCmd;
import com.citycloud.dashboard.parameter.query.person.PersonListQuery;
import com.citycloud.dashboard.viewobject.person.PersonVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author guopeng
 * @since 2022-03-30
 */
public interface PersonService extends IService<PersonDo> {

  int create(CreatePersonCmd cmd);

  int update(UpdatePersonCmd cmd);

  int deleteById(Integer id);

  PersonVo findById(Integer id);

  PageInfo<PersonVo> findListByPage(PersonListQuery listQuery);

  List<PersonVo> getPersons();
}
