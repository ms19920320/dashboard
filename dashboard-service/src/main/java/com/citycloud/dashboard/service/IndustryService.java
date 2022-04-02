package com.citycloud.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.dataobject.IndustryDo;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.viewobject.industry.IndustryVo1;

import java.util.List;
import java.util.Map;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
public interface IndustryService extends IService<IndustryDo> {
    ApiResponse<IndustryVo1> industryStatistics(IndustryListQuery cmd);
}
