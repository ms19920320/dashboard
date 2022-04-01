package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.dashboard.dao.OrganizeDao;
import com.citycloud.dashboard.dao.dataobject.OrganizeDo;
import com.citycloud.dashboard.service.OrganizeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sf
 * @date 2022-04-01
 */
@Slf4j
@Service
public class OrganizeServiceImpl extends ServiceImpl<OrganizeDao, OrganizeDo>
        implements OrganizeService {

    @Autowired
    private OrganizeDao organizeDao;

}
