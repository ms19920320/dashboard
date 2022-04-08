package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.SoftPatentDao;
import com.citycloud.dashboard.dao.dataobject.SoftPatentDo;
import com.citycloud.dashboard.service.SoftPatentService;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByDateRes;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByTypeRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.citycloud.dashboard.dao.dataobject.SoftPatentDo.DATE;

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

    @Override
    public List<PatentStaticsByDateRes> softPatentStaticsByDate() {
        QueryWrapper queryWrapper = new QueryWrapper<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String currentYear = sdf.format(new Date());
        String startYear = String.valueOf(Integer.valueOf(currentYear) - 5);
        queryWrapper.gt(true, "DATE_FORMAT(" + SoftPatentDo.DATE + ",'%Y')", startYear);
        queryWrapper.lt(true, "DATE_FORMAT(" + SoftPatentDo.DATE + ",'%Y')", currentYear);
        queryWrapper.eq(SoftPatentDo.TYPE, SoftPatentDo.Type.PATENT.getType());
        queryWrapper.groupBy("DATE_FORMAT(" + SoftPatentDo.DATE + ",'%Y')");
        queryWrapper.select("count(" + SoftPatentDo.SOFT_PATENT_ID + ") as total", "DATE_FORMAT(" + SoftPatentDo.DATE + ",'%Y') as date");
        List<PatentStaticsByDateRes> list = softPatentDao.selectMaps(queryWrapper);
        return list;
    }
}
