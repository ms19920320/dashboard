package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.PersonnelDao;
import com.citycloud.dashboard.dao.dataobject.PersonnelDo;
import com.citycloud.dashboard.service.PersonnelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sf
 * @date 2022-04-01
 */
@Slf4j
@Service
public class PersonnelServiceImpl extends ServiceImpl<PersonnelDao, PersonnelDo>
    implements PersonnelService {

  @Autowired private PersonnelDao personnelDao;

}
