package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.SoftPatentDo;
import com.citycloud.dashboard.viewobject.softpatent.PatentStaticsByTypeRes;

import java.util.List;

/**
 * 统计专利操作
 *
 * @author 孟帅
 * @since  2022-04-01
 */
public interface SoftPatentService extends IService<SoftPatentDo> {

    /**
     * 统计专利/软著总量
     *
     * @return .
     */
    List<PatentStaticsByTypeRes> softPatentStaticsByType();
}
