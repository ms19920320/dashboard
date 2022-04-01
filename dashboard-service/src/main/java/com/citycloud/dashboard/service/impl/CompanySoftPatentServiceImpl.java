package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.spring.utils.BeanCopyUtils;
import com.citycloud.dashboard.dao.CompanySoftPatentDao;
import com.citycloud.dashboard.dao.dataobject.CompanySoftPatentDo;
import com.citycloud.dashboard.parameter.command.companysoftpatent.CreateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.command.companysoftpatent.UpdateCompanySoftPatentCmd;
import com.citycloud.dashboard.parameter.query.companysoftpatent.CompanySoftPatentListQuery;
import com.citycloud.dashboard.service.CompanySoftPatentService;
import com.citycloud.dashboard.viewobject.companysoftpatent.CompanySoftPatentVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Slf4j
@Service
public class CompanySoftPatentServiceImpl
    extends ServiceImpl<CompanySoftPatentDao, CompanySoftPatentDo>
    implements CompanySoftPatentService {

  @Autowired private CompanySoftPatentDao companySoftPatentDao;

  @Override
  public int create(CreateCompanySoftPatentCmd cmd) {
    CompanySoftPatentDo companySoftPatentDo =
        BeanCopyUtils.cloneFrom(cmd, CompanySoftPatentDo.class);
    //CompanySoftPatentDo.setId(UidGenerator.generate());
    return companySoftPatentDao.insert(companySoftPatentDo);
  }

  @Override
  public int update(UpdateCompanySoftPatentCmd cmd) {
    CompanySoftPatentDo companySoftPatentDo =
        BeanCopyUtils.cloneFrom(cmd, CompanySoftPatentDo.class);
    return companySoftPatentDao.updateById(companySoftPatentDo);
  }

  @Override
  public int deleteById(Integer id) {
    return companySoftPatentDao.deleteById(id);
  }

  @Override
  public CompanySoftPatentVo findById(Integer id) {
    CompanySoftPatentDo companySoftPatentDo = companySoftPatentDao.selectById(id);
    return BeanCopyUtils.cloneFrom(companySoftPatentDo, CompanySoftPatentVo.class);
  }

  @Override
  public PageInfo<CompanySoftPatentVo> findListByPage(CompanySoftPatentListQuery listQuery) {
    int pageNum = listQuery.getPageNum() >= 1 ? listQuery.getPageNum() : 1;
    int pageSize = listQuery.getPageSize() >= 0 ? listQuery.getPageSize() : 10;
    CompanySoftPatentDo companySoftPatentDo =
        BeanCopyUtils.cloneFrom(listQuery, CompanySoftPatentDo.class);
    QueryWrapper<CompanySoftPatentDo> queryWrapper = new QueryWrapper<>();
    Page<CompanySoftPatentDo> companySoftPatentDoPage =
        PageMethod.startPage(pageNum, pageSize, false)
            .doSelectPage(() -> companySoftPatentDao.selectList(queryWrapper));
    return companySoftPatentDoPage.toPageInfo(
        companySoftPatentDao ->
            BeanCopyUtils.cloneFrom(companySoftPatentDao, CompanySoftPatentVo.class));
  }
}
