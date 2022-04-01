package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.SoftPatentDao;
import com.citycloud.dashboard.dao.dataobject.SoftPatentDo;
import com.citycloud.dashboard.service.SoftPatentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sf
 * @date 2022-04-01
 */
@Slf4j
@Service
public class SoftPatentServiceImpl extends ServiceImpl<SoftPatentDao, SoftPatentDo>
    implements SoftPatentService {

  @Autowired private SoftPatentDao softPatentDao;


}
