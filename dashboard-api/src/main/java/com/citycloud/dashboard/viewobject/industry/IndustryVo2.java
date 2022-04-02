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
public class IndustryVo2 implements Serializable {
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

        @ApiModelProperty(value = "产业位置 02-上游 03-中游 04-下游", position = 2)
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
