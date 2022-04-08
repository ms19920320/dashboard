package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.SoftPatentDao;
import com.citycloud.dashboard.dao.dataobject.SoftPatentDo;
import com.citycloud.dashboard.service.SoftPatentService;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByTypeRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sf
 * @date 2022-04-01
 */
@Slf4j
@Service
public class SoftPatentServiceImpl extends ServiceImpl<SoftPatentDao, SoftPatentDo>
        implements SoftPatentService {

    @Autowired
    private SoftPatentDao softPatentDao;


    @Override
    public List<PatentStaticsByTypeRes> softPatentStaticsByType() {
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.select("count(" + SoftPatentDo.SOFT_PATENT_ID + ") as total", SoftPatentDo.TYPE);
        queryWrapper.groupBy(SoftPatentDo.TYPE);
        return softPatentDao.selectMaps(queryWrapper);
    }
}
