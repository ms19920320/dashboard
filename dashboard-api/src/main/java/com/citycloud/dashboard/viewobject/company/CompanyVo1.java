package com.citycloud.dashboard.viewobject.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("CompanyVo1")
public class CompanyVo1 implements Serializable {
    public static final String TOTAL = "total";

    @ApiModelProperty(value = "数量")
    private Long total;

    @ApiModelProperty(value = "省份", position = 1)
    private String province;
}
