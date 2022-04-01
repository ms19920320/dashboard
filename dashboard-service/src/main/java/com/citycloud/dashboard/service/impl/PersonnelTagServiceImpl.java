package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.PersonnelTagDao;
import com.citycloud.dashboard.dao.dataobject.PersonnelTagDo;
import com.citycloud.dashboard.service.PersonnelTagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sf
 * @date 2022-04-01
 */
@Slf4j
@Service
public class PersonnelTagServiceImpl extends ServiceImpl<PersonnelTagDao, PersonnelTagDo>
    implements PersonnelTagService {

  @Autowired private PersonnelTagDao personnelTagDao;

}
