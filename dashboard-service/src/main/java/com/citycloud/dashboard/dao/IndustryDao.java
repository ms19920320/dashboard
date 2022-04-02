package com.citycloud.dashboard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citycloud.dashboard.dao.dataobject.IndustryDo;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Mapper
public interface IndustryDao extends BaseMapper<IndustryDo> {
    /**
     * 统计不同产业对应的公司数量
     *
     * @param cmd .
     * @return .
     */
    List<Map<String, Object>> industryStatistics(IndustryListQuery cmd);
}
