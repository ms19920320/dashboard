package com.citycloud.dashboard.viewobject.softpatent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 统计专利/软著总量返回内容
 *
 * @author 孟帅
 * @since 2022-04-01
 */
@Data
@ApiModel("PatentStaticsByTypeRes")
public class PatentStaticsByTypeRes implements Serializable {
        @ApiModelProperty(value = "类型")
        private String type;

        @ApiModelProperty(value = "数量")
        private long total;

}
