package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.OrganizePersonnelDao;
import com.citycloud.dashboard.dao.dataobject.OrganizePersonnelDo;
import com.citycloud.dashboard.service.OrganizePersonnelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sf
 * @date 2022-04-01
 */
@Slf4j
@Service
public class OrganizePersonnelServiceImpl
    extends ServiceImpl<OrganizePersonnelDao, OrganizePersonnelDo>
    implements OrganizePersonnelService {

  @Autowired private OrganizePersonnelDao organizePersonnelDao;

}
