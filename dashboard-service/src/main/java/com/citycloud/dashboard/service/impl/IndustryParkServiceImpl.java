package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.spring.utils.BeanCopyUtils;
import com.citycloud.dashboard.dao.IndustryParkDao;
import com.citycloud.dashboard.dao.dataobject.IndustryParkDo;
import com.citycloud.dashboard.service.IndustryParkService;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 孟帅
 * @since 2022-04-01
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

}
