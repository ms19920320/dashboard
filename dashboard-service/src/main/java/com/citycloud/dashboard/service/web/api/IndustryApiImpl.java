package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.CommandMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.IndustryApi;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery1;
import com.citycloud.dashboard.service.IndustryService;
import com.citycloud.dashboard.viewobject.industry.IndustryVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * 产业表web入口
 *
 * @author 孟帅
 * @since 2022-03-31
 */
@ApiController(path = "/industry")
public class IndustryApiImpl implements IndustryApi {

    @Autowired
    private IndustryService industryService;


    /**
     * 统计产业对应的公司数量
     *
     * @param cmd 查询条件
     * @return .
     */
    @CrossOrigin
    @CommandMapping("industryStatistics")
    @Override
    public ApiResponse<IndustryVo1> industryStatistics(IndustryListQuery cmd) {
        return industryService.industryStatistics(cmd);
    }


    @Override
    public ApiResponse<IndustryVo1> analysis(IndustryListQuery1 cmd) {
        return null;
    }
}
