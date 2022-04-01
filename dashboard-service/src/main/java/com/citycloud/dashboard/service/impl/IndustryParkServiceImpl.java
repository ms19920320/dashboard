package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.spring.utils.BeanCopyUtils;
import com.citycloud.dashboard.dao.IndustryParkDao;
import com.citycloud.dashboard.dao.dataobject.IndustryParkDo;
import com.citycloud.dashboard.parameter.command.industrypark.CreateIndustryParkCmd;
import com.citycloud.dashboard.parameter.command.industrypark.UpdateIndustryParkCmd;
import com.citycloud.dashboard.parameter.query.industrypark.IndustryParkListQuery;
import com.citycloud.dashboard.service.IndustryParkService;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
@Slf4j
@Service
public class IndustryParkServiceImpl extends ServiceImpl<IndustryParkDao, IndustryParkDo>
        implements IndustryParkService {

    @Autowired
    private IndustryParkDao industryParkDao;

    @Override
    public List<IndustryParkVo> findAll() {
        List<IndustryParkDo> industryParkDos = industryParkDao.selectList(new QueryWrapper<>());
        return BeanCopyUtils.cloneFromList(industryParkDos, IndustryParkVo.class, "");
    }

//  @Override
//  public int create(CreateIndustryParkCmd cmd) {
//    IndustryParkDo industryParkDo = BeanCopyUtils.cloneFrom(cmd, IndustryParkDo.class);
//    //IndustryParkDo.setId(UidGenerator.generate());
//    return industryParkDao.insert(industryParkDo);
//  }
//
//  @Override
//  public int update(UpdateIndustryParkCmd cmd) {
//    IndustryParkDo industryParkDo = BeanCopyUtils.cloneFrom(cmd, IndustryParkDo.class);
//    return industryParkDao.updateById(industryParkDo);
//  }
//
//  @Override
//  public int deleteById(Integer id) {
//    return industryParkDao.deleteById(id);
//  }
//
//  @Override
//  public IndustryParkVo findById(Integer id) {
//    IndustryParkDo industryParkDo = industryParkDao.selectById(id);
//    return BeanCopyUtils.cloneFrom(industryParkDo, IndustryParkVo.class);
//  }
//
//  @Override
//  public PageInfo<IndustryParkVo> findListByPage(IndustryParkListQuery listQuery) {
//    int pageNum = listQuery.getPageNum() >= 1 ? listQuery.getPageNum() : 1;
//    int pageSize = listQuery.getPageSize() >= 0 ? listQuery.getPageSize() : 10;
//    IndustryParkDo industryParkDo = BeanCopyUtils.cloneFrom(listQuery, IndustryParkDo.class);
//    QueryWrapper<IndustryParkDo> queryWrapper = new QueryWrapper<>();
//    Page<IndustryParkDo> industryParkDoPage =
//        PageMethod.startPage(pageNum, pageSize, false)
//            .doSelectPage(() -> industryParkDao.selectList(queryWrapper));
//    return industryParkDoPage.toPageInfo(
//        industryParkDao -> BeanCopyUtils.cloneFrom(industryParkDao, IndustryParkVo.class));
//  }
}
