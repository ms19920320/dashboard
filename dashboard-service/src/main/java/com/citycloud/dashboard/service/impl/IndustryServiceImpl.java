package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.citycloud.ccuap.spring.utils.BeanCopyUtils;
import com.citycloud.dashboard.dao.IndustryDao;
import com.citycloud.dashboard.dao.dataobject.IndustryDo;
import com.citycloud.dashboard.parameter.command.industry.CreateIndustryCmd;
import com.citycloud.dashboard.parameter.command.industry.UpdateIndustryCmd;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.service.IndustryService;
import com.citycloud.dashboard.viewobject.industry.IndustryVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
@Slf4j
@Service
public class IndustryServiceImpl extends ServiceImpl<IndustryDao, IndustryDo>
    implements IndustryService {

  @Autowired private IndustryDao industryDao;

  @Override
  public int create(CreateIndustryCmd cmd) {
    IndustryDo industryDo = BeanCopyUtils.cloneFrom(cmd, IndustryDo.class);
    //IndustryDo.setIndustryId(UidGenerator.generate());
    return industryDao.insert(industryDo);
  }

  @Override
  public int update(UpdateIndustryCmd cmd) {
    IndustryDo industryDo = BeanCopyUtils.cloneFrom(cmd, IndustryDo.class);
    return industryDao.updateById(industryDo);
  }

  @Override
  public int deleteById(String id) {
    return industryDao.deleteById(id);
  }

  @Override
  public IndustryVo findById(String id) {
    IndustryDo industryDo = industryDao.selectById(id);
    return BeanCopyUtils.cloneFrom(industryDo, IndustryVo.class);
  }

  @Override
  public PageInfo<IndustryVo> findListByPage(IndustryListQuery listQuery) {
    int pageNum = listQuery.getPageNum() >= 1 ? listQuery.getPageNum() : 1;
    int pageSize = listQuery.getPageSize() >= 0 ? listQuery.getPageSize() : 10;
    IndustryDo industryDo = BeanCopyUtils.cloneFrom(listQuery, IndustryDo.class);
    QueryWrapper<IndustryDo> queryWrapper = new QueryWrapper<>();
    Page<IndustryDo> industryDoPage =
        PageMethod.startPage(pageNum, pageSize, false)
            .doSelectPage(() -> industryDao.selectList(queryWrapper));
    return industryDoPage.toPageInfo(
        industryDao -> BeanCopyUtils.cloneFrom(industryDao, IndustryVo.class));
  }
}
