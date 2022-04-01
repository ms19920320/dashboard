package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.dashboard.dao.dataobject.IndustryParkDo;
import com.citycloud.dashboard.viewobject.industrypark.IndustryParkVo;

import java.util.List;

/**
 * @author 孟帅
 * @since 2022-04-01
 */
public interface IndustryParkService extends IService<IndustryParkDo> {
    List<IndustryParkVo> findAll();

}
