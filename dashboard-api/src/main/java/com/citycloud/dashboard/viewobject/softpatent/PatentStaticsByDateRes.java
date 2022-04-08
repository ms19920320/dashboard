package com.citycloud.dashboard.viewobject.softpatent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 按日期统计专利/软著总览返回内容
 *
 * @author 孟帅
 * @since 2022-04-01
 */
@Data
@ApiModel("PatentStaticsByDateRes")
public class PatentStaticsByDateRes implements Serializable {
        @ApiModelProperty(value = "日期")
        private String date;

        @ApiModelProperty(value = "数量")
        private long total;

}
