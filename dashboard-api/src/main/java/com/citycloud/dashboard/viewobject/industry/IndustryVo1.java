package com.citycloud.dashboard.viewobject.industry;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("IndustryVo1")
public class IndustryVo1 implements Serializable {
    public static final String INDUSTRY_ID = "industry_id";

    public static final String PARENT_ID = "parent_id";

    public static final String NAME = "name";

    public static final String POSITION = "position";

    public static final String DETAIL = "detail";

    public static final String TOTAL = "total";

    public static final String HIERARCHY = "hierarchy";

    @ApiModelProperty(value = "产业编号")
    private String industryId;

    @ApiModelProperty(value = "产业名称", position = 1)
    private String name;

    @ApiModelProperty(value = "子层产业详情", position = 2)
    private List<Hierarchy02> detail;

    @Data
    @ApiModel("Hierarchy02")
    public static class Hierarchy02 {
        @ApiModelProperty(value = "产业编号")
        private String industryId;

        @ApiModelProperty(value = "产业名称", position = 1)
        private String name;

        @ApiModelProperty(value = "产业位置 2-上游 3-中游 4-下游", position = 2)
        private String position;

        @ApiModelProperty(value = "子层产业详情", position = 3)
        private List<Hierarchy03> detail;
    }

    @Data
    @ApiModel("Hierarchy03")
    public static class Hierarchy03 {
        @ApiModelProperty(value = "产业编号")
        private String industryId;

        @ApiModelProperty(value = "产业名称", position = 1)
        private String name;

        @ApiModelProperty(value = "子层产业详情", position = 2)
        private List<Hierarchy04> detail;
    }

    @Data
    @ApiModel("Hierarchy04")
    public static class Hierarchy04 {
        @ApiModelProperty(value = "产业编号")
        private String industryId;

        @ApiModelProperty(value = "产业名称", position = 1)
        private String name;

        @ApiModelProperty(value = "当前区域产业对应的公司数量", position = 2)
        private Long currentTotal;

        @ApiModelProperty(value = "全国区域产业对应的公司数量", position = 3)
        private Long countryTotal;
    }

}
