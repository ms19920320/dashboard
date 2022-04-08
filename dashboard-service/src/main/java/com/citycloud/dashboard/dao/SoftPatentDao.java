package com.citycloud.dashboard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citycloud.dashboard.dao.dataobject.SoftPatentDo;
import com.citycloud.dashboard.parameter.query.softpatent.SoftPatentListQuery1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sf
 * @date 2022-04-01
 */
@Mapper
public interface SoftPatentDao extends BaseMapper<SoftPatentDo> {

    /**
     * 专利/软著按年统计查询
     * @param cmd .
     * @return .
     */
    List<SoftPatentDo> softPatentStatics(SoftPatentListQuery1 cmd);
}
