package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.spring.utils.BeanCopyUtils;
import com.citycloud.dashboard.dao.CompanyDao;
import com.citycloud.dashboard.dao.dataobject.CompanyDo;
import com.citycloud.dashboard.parameter.command.company.CreateCompanyCmd;
import com.citycloud.dashboard.parameter.command.company.UpdateCompanyCmd;
import com.citycloud.dashboard.parameter.query.company.CompanyListQuery;
import com.citycloud.dashboard.service.CompanyService;
import com.citycloud.dashboard.viewobject.company.CompanyVo;
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
public class CompanyServiceImpl extends ServiceImpl<CompanyDao, CompanyDo>
    implements CompanyService {

  @Autowired private CompanyDao companyDao;

  @Override
  public int create(CreateCompanyCmd cmd) {
    CompanyDo companyDo = BeanCopyUtils.cloneFrom(cmd, CompanyDo.class);
    //CompanyDo.setCompanyId(UidGenerator.generate());
    return companyDao.insert(companyDo);
  }

  @Override
  public int update(UpdateCompanyCmd cmd) {
    CompanyDo companyDo = BeanCopyUtils.cloneFrom(cmd, CompanyDo.class);
    return companyDao.updateById(companyDo);
  }

  @Override
  public int deleteById(String id) {
    return companyDao.deleteById(id);
  }

  @Override
  public CompanyVo findById(String id) {
    CompanyDo companyDo = companyDao.selectById(id);
    return BeanCopyUtils.cloneFrom(companyDo, CompanyVo.class);
  }

  @Override
  public PageInfo<CompanyVo> findListByPage(CompanyListQuery listQuery) {
    int pageNum = listQuery.getPageNum() >= 1 ? listQuery.getPageNum() : 1;
    int pageSize = listQuery.getPageSize() >= 0 ? listQuery.getPageSize() : 10;
    CompanyDo companyDo = BeanCopyUtils.cloneFrom(listQuery, CompanyDo.class);
    QueryWrapper<CompanyDo> queryWrapper = new QueryWrapper<>();
    Page<CompanyDo> companyDoPage =
        PageMethod.startPage(pageNum, pageSize, false)
            .doSelectPage(() -> companyDao.selectList(queryWrapper));
    return companyDoPage.toPageInfo(
        companyDao -> BeanCopyUtils.cloneFrom(companyDao, CompanyVo.class));
  }
}
