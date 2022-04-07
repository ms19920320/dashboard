package com.citycloud.dashboard.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citycloud.dashboard.dao.dataobject.SysUserDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huxx
 * @date 2022-04-06
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserDo> {
    SysUserDo findUserByUsername(String username);
}
