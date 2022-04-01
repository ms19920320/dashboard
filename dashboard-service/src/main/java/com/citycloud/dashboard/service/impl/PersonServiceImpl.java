package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.spring.utils.BeanCopyUtils;
import com.citycloud.dashboard.dao.PersonDao;
import com.citycloud.dashboard.dao.dataobject.PersonDo;
import com.citycloud.dashboard.parameter.command.person.CreatePersonCmd;
import com.citycloud.dashboard.parameter.command.person.UpdatePersonCmd;
import com.citycloud.dashboard.parameter.query.person.PersonListQuery;
import com.citycloud.dashboard.service.PersonService;
import com.citycloud.dashboard.viewobject.person.PersonVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guopeng
 * @since 2022-03-30
 */
@Slf4j
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, PersonDo> implements PersonService {

  @Autowired private PersonDao personDao;

  @Override
  public int create(CreatePersonCmd cmd) {
    PersonDo personDo = BeanCopyUtils.cloneFrom(cmd, PersonDo.class);
    //PersonDo.setId(UidGenerator.generate());
    return personDao.insert(personDo);
  }

  @Override
  public int update(UpdatePersonCmd cmd) {
    PersonDo personDo = BeanCopyUtils.cloneFrom(cmd, PersonDo.class);
    return personDao.updateById(personDo);
  }

  @Override
  public int deleteById(Integer id) {
    return personDao.deleteById(id);
  }

  @Override
  public PersonVo findById(Integer id) {
    PersonDo personDo = personDao.selectById(id);
    return BeanCopyUtils.cloneFrom(personDo, PersonVo.class);
  }

  @Override
  public PageInfo<PersonVo> findListByPage(PersonListQuery listQuery) {
    int pageNum = listQuery.getPageNum() >= 1 ? listQuery.getPageNum() : 1;
    int pageSize = listQuery.getPageSize() >= 0 ? listQuery.getPageSize() : 10;
    QueryWrapper<PersonDo> queryWrapper = new QueryWrapper<>();
    Page<PersonDo> personDoPage =
        PageMethod.startPage(pageNum, pageSize, true)
            .doSelectPage(() -> personDao.selectList(queryWrapper));
    return personDoPage.toPageInfo(personDao -> BeanCopyUtils.cloneFrom(personDao, PersonVo.class));
  }

  @Override
  public List<PersonVo> getPersons() {
    return personDao.getPersons();
  }
}
