package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.response.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

/**
 * 公司表操作接口
 *
 * @author 孟帅
 * @since 2022-03-31
 */
@Api(tags = "企业表对应操作接口")
public interface CompanyApi {

    /**
     * 按省份获取企业数量
     *
     * @return 统一响应格式对象
     */
    @ApiOperation(value = "按省份获取企业数", notes = "按省份获取企业数,及统计总企业数")
    ApiResponse<List<Map<String, Object>>> findCompanyGroupByProvince();

}
