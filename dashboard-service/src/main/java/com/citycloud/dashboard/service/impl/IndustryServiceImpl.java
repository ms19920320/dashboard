package com.citycloud.dashboard.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.dao.IndustryDao;
import com.citycloud.dashboard.dao.dataobject.IndustryDo;
import com.citycloud.dashboard.parameter.query.industry.IndustryListQuery;
import com.citycloud.dashboard.service.IndustryService;
import com.citycloud.dashboard.viewobject.industry.IndustryVo;
import com.citycloud.dashboard.viewobject.industry.IndustryVo1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Slf4j
@Service
public class IndustryServiceImpl extends ServiceImpl<IndustryDao, IndustryDo>
        implements IndustryService {

    @Autowired
    private IndustryDao industryDao;

    @Override
    public ApiResponse<IndustryVo1> industryStatistics(IndustryListQuery cmd) {
        // 当前区域各种产品对应的公司数量
        List<Map<String, Object>> current = industryDao.industryStatistics(cmd);

        // 全国各种产品对应的公司数量
        List<Map<String, Object>> country = industryDao.industryStatistics(new IndustryListQuery());

        // 获取最高层级的产业信息
        List<Map<String, Object>> collect = current.stream().filter(p -> IndustryVo.Hierarchy.O1.getHierarchy().equals(p.get(IndustryVo1.HIERARCHY))).collect(Collectors.toList());
        if (collect.isEmpty()) {
            ApiResponse<IndustryVo1> failed = ApiResponse.failed();
            failed.setMessage("no data");
            return failed;
        }
        String industryId01 = (String) collect.get(0).get(IndustryVo1.INDUSTRY_ID);
        IndustryVo1 industryVo1 = new IndustryVo1();
        industryVo1.setName((String) collect.get(0).get(IndustryVo1.NAME));
        industryVo1.setIndustryId(industryId01);

        // 记录第二层级产业信息
        List<IndustryVo1.Hierarchy02> hierarchy02s = new ArrayList<>();
        industryVo1.setDetail(hierarchy02s);

        // 将当前区域所有产业信息按不同层级进行分类
        Map<Object, List<Map<String, Object>>> collect1 = current.stream().collect(Collectors.groupingBy(p -> p.get(IndustryVo1.PARENT_ID)));

        // 获取第二层级的产业
        List<Map<String, Object>> list02 = current.stream().filter(p -> industryId01.equals(p.get(IndustryVo1.PARENT_ID))).collect(Collectors.toList());
        list02.stream().forEach(p -> {
            String industryId02 = (String) p.get(IndustryVo1.INDUSTRY_ID);
            String name02 = (String) p.get(IndustryVo1.NAME);
            String position = (String) p.get(IndustryVo1.POSITION);
            IndustryVo1.Hierarchy02 hierarchy02 = new IndustryVo1.Hierarchy02();
            hierarchy02.setIndustryId(industryId02);
            hierarchy02.setName(name02);
            hierarchy02.setPosition(position);
            hierarchy02s.add(hierarchy02);

            // 记录第三层级产业信息
            List<IndustryVo1.Hierarchy03> hierarchy03s = new ArrayList<>();
            hierarchy02.setDetail(hierarchy03s);

            extracted(country, collect1, industryId02, hierarchy03s);

        });
        return ApiResponse.successWithData(industryVo1);
    }

    private void extracted(List<Map<String, Object>> country, Map<Object, List<Map<String, Object>>> collect1, String industryId02, List<IndustryVo1.Hierarchy03> hierarchy03s) {
        // 获取第三层级的产业信息
        List<Map<String, Object>> list03 = collect1.get(industryId02);
        list03.stream().forEach(p2 -> {
            String industryId03 = (String) p2.get(IndustryVo1.INDUSTRY_ID);
            String name03 = (String) p2.get(IndustryVo1.NAME);
            IndustryVo1.Hierarchy03 hierarchy03 = new IndustryVo1.Hierarchy03();
            hierarchy03.setIndustryId(industryId03);
            hierarchy03.setName(name03);
            hierarchy03s.add(hierarchy03);

            // 记录第四层级产业信息
            List<IndustryVo1.Hierarchy04> hierarchy04s = new ArrayList<>();
            hierarchy03.setDetail(hierarchy04s);
            List<Map<String, Object>> list04 = collect1.get(industryId03);
            list04.stream().forEach(p3 -> {
                IndustryVo1.Hierarchy04 hierarchy04 = new IndustryVo1.Hierarchy04();
                String industryId04 = (String) p3.get(IndustryVo1.INDUSTRY_ID);
                String name = (String) p3.get(IndustryVo1.NAME);
                Long total = (Long) p3.get(IndustryVo1.TOTAL);
                hierarchy04.setIndustryId(industryId04);
                hierarchy04.setName(name);
                hierarchy04.setCurrentTotal(total);

                // 获取该产业全国公司数量
                Map<String, Object> map = country.stream().filter(p4 -> industryId04.equals(p4.get("industry_id"))).findFirst().orElseGet(null);
                Long countryTotal = 0L;
                if (map != null && map.get(IndustryVo1.TOTAL) != null) {
                    countryTotal = (Long) map.get(IndustryVo1.TOTAL);
                }
                hierarchy04.setCountryTotal(countryTotal);
                hierarchy04s.add(hierarchy04);
            });
        });
    }
}
