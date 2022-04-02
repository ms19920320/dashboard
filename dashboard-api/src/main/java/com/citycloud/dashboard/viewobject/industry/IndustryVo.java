package com.citycloud.dashboard.viewobject.industry;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("industry")
public class IndustryVo implements Serializable {

    @ApiModelProperty(value = "产业编号")
    private String industryId;

    @ApiModelProperty(value = "产业名称")
    private String name;

    @ApiModelProperty(value = "父级产业编号")
    private String parentId;

    @ApiModelProperty(value = "层级，01-电机产业链")
    private String hierarchy;

    @ApiModelProperty(value = "处于产业位置")
    private String position;

    /**
     * 用来表示当前产业类型所属的层级枚举类
     *
     * @author 孟帅
     * @since 2022/3/29
     */
    public enum Hierarchy {
        // 第一层级-电机产业链
        O1("01"),

        // 第二层级-电机应用设备，电机原材料，电机零部件，电机集成
        O2("02"),

        // 第三层级-xx
        O3("03"),

        // 第四层级-xx
        O4("04");

        private String hierarchy;

        Hierarchy(String hierarchy) {
            this.hierarchy = hierarchy;
        }

        public String getHierarchy() {
            return hierarchy;
        }
    }

    /**
     * 用来表示产业位置的枚举类
     *
     * @author 孟帅
     * @since 2022/3/29
     */
    public enum Position {
        // 产业处于上游位置
        UP("01"),

        // 产业处于中游位置
        MIDDLE("02"),

        // 产业处于下游位置
        BELOW("03");

        private String position;

        Position(String position) {
            this.position = position;
        }

        public String getPosition() {
            return position;
        }
    }
}
